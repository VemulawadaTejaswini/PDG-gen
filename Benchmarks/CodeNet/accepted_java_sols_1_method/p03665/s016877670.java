


import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();
			int P = scan.nextInt();
			long[]A = new long[N];
			long[][]d = new long[N+1][2];
			long[][]s = new long[N+1][2];
			for(int i = 0;i<N;i++)A[i] = scan.nextInt();



			int ok = 0;
			for(int i = 0;i<N;i++) {

				if(A[i]%2==1)ok=1;


			}

			if(ok==0)
				if(P==0)
				System.out.println((long)Math.pow(2, N));
				else
					System.out.println(0);
			else {
				System.out.println((long)Math.pow(2, N-1));
			}






		}


	}


}
