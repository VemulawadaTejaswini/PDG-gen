import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int N = stdIn.nextInt();
			if(N == 0) break;
			int[] k = new int[N];
			
			for(int i = 0; i < N; i++) {
				k[i] = stdIn.nextInt();
			}
			int max = k[0];
			int s = 1;
			for(int i = 1; i < N; i++) {
				if(max < k[i]) max = k[i];
				if(k[i] != 0) {
					s++;
				}
			}
			
			if(max < 2) {
				System.out.println("NA");
			}
			else {
				System.out.println(s+1);
			}
		}
	}
		
}