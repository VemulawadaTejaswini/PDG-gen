import java.util.Scanner;

public class Main {

	// 109-A
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 2 || b ==2)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}

		sc.close();
	}
}