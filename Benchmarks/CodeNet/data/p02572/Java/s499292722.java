import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){


			int N = scan.nextInt();
			long[]A = new long[N];
			long[]S = new long [N+1];
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextLong();
				S[i+1] = S[i]+A[i];
			}

			long mod = 1000000000+7;

			long goukei = 0;

			for(int i = 0;i<N;i++) {
				goukei=(goukei+(A[i]*(S[N]-S[i+1]))%mod)%mod;
			}

			System.out.println(goukei);







		}


	}


}
