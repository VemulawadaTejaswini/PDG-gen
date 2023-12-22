import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		
		long A = 1;
		for(long i=1;i*i<=N;i++) {
			if(N%i == 0 && i>A) {
				A = i;
			}
		}
		long B = N/A;
		
		
		System.out.println(A+B-2);
		
		sc.close();
	}
}