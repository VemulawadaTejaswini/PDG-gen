import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int sum = A + B;
		if (sum >= C)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}
}