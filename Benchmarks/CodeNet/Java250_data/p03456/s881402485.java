import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = Integer.valueOf(String.valueOf(a) + String.valueOf(b));

		boolean can = false;
		for (int i = 1; i <= 10000; i++) {
			if (c == Math.pow(i, 2)) can = true;
		}

		if (can) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


		sc.close();
	}

}
