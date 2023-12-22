import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] intArray = {};
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		System.out.println((int)Math.pow(n, 3));

		sc.close();
	}

}

