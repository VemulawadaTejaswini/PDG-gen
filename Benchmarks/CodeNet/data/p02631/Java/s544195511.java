import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();
			long []a = new long[N];
			long S = 0;

			for(int i = 0;i<N;i++) {
				a[i] = scan.nextLong();
				S = S^a[i];

			}

			for(int i = 0;i<N;i++) {
				System.out.println(S^a[i]);
			}






		}


	}


}
