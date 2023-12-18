
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		String[] lines = line.split(" ");

		int N = Integer.parseInt(lines[0]);
		int M = Integer.parseInt(lines[1]);
		long K = Long.parseLong(lines[2]);
		long[] A = new long[N];
		long[] B = new long[M];

		line = sc.nextLine();
		lines = line.split(" ");
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(lines[i]);
		}

		line = sc.nextLine();
		lines = line.split(" ");
		for (int i = 0; i < M; i++) {
			B[i] = Long.parseLong(lines[i]);
		}

		long t = 0;
		for(int i = 0; i < M; i++) {
			t = t + B[i];//先にBをすべて読んだ時の時間を足しておく
		}

		int count = 0;
		int j = M;
		for(int i = 0; i < A.length+1; i++) {//Aがi冊で、Bがj冊
			while(j > 0 &&  t > K) {
				j--;
				t = t - B[j];
			}

			if(t > K) {
				break;
			}
			count = Math.max(count, i+j);
			if(i == N) {
				break;
			}
			t = t + A[i];
		}

		System.out.println(count);
	}
}