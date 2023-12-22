import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int A = sc.nextInt();
		final int C = 500;
		sc.close();
		
		int n = N%C; // 0 <= n <= 499
		if(A >= n) System.out.println("Yes");
		else System.out.println("No");
	}

}