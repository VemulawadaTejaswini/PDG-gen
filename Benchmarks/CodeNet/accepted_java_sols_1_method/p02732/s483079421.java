import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int[N];
		
		long[] box = new long[N];
		for(int i = 0; i < N; i ++) {
			box[i] = 0;
		}
		
		for(int i = 0; i < N; i ++) {
			A[i] = stdIn.nextInt();
			box[A[i] - 1] ++;
		}
		
		long ans = 0;
		for(int i = 0; i < N; i ++) {
			if(box[i] == 0) {
				continue;
			}
			ans += box[i] * (box[i] - 1) / 2;
		}
		
		for(int i = 0; i < N; i ++) {
			System.out.println(ans - (box[A[i] - 1] - 1));
		}
	}
}