import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x[] = new int[]{0, 1, 3, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1};

		System.out.println(x[a] == x[b] ? "Yes" : "No");

		sc.close();

	}

}