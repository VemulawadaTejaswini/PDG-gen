import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		
		if (N % 2 == 1) {
			System.out.println("No");
			return;
		}
		
		int M = N/2;
		String S1 = S.substring(0,M);
		String S2 = S.substring(M,N);
		
		if (S1.equals(S2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
