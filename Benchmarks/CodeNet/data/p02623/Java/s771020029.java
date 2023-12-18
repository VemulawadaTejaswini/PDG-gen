
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
//			System.out.println(A[i]);
		}

		line = sc.nextLine();
		lines = line.split(" ");
		for (int i = 0; i < M; i++) {
			B[i] = Long.parseLong(lines[i]);
//			System.out.println(B[i]);
		}

		int a = 0;
		int b = 0;
		long[] total = new long[N + M];
		for (int i = 0; i < total.length; i++) {
			if (a < A.length && b < B.length) {
				if (A[a] <= B[b]) {
					total[i] = A[a];
					a++;
				} else {
					total[i] = B[b];
					b++;
				}
			}else if(a >= A.length && b < B.length){
				total[i] = B[b];
				b++;				
			}else if(a < A.length && b >= B.length) {
				total[i] = A[a];
				a++;				
			}
		}

		long sum = 0;
		long count = 0;
		for(int i = 0; i < total.length; i++) {
			if(sum + total[i] <= K) {
				sum = sum + total[i];
				count++;
			}else {
				break;
			}
		}

		System.out.println(count);
	}
}