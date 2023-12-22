import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int a = 10*A+B+C;
		int b = 10*B+C+A;
		int c = 10*C+A+B;
		
		System.out.println(Math.max(Math.max(a, b), c));

		sc.close();
	}

}
