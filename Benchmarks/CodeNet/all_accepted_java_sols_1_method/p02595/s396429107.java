import java.util.Scanner;


public class Main  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long D = sc.nextInt();
		int count = 0;
		for(int i = 0; i < N; i++) {
			long p = sc.nextInt();
			long q = sc.nextInt();
			if(D * D >= (p * p) + (q * q)) {
				count++;
			}
		}
		System.out.print(count);	
	}
}
