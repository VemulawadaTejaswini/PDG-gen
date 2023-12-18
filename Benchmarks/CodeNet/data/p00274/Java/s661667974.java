import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int N = stdIn.nextInt();
			int[] k = new int[N];
			
			for(int i = 0; i < N; i++) {
				k[i] = stdIn.nextInt();
			}
			int min = k[0];
			int s = 1;
			for(int i = 1; i < N; i++) {
				if(min > k[i]) min = k[i];
				s++;
			}
			
			if(min < 2) System.out.println("NA");
			else System.out.println(s+1);
		}
	}
		
}