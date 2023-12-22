import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		
		if(A > D || B < C)
			System.out.println("0");
		else {
			int x = B > D ? D : B;
			if(A < C)
				System.out.println((x - C));
			else
				System.out.println((x - A));
		}
	}
}
