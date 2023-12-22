import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		while (!isPrime(x)) {
			x++;
		}
		System.out.println(x);
		kb.close();

	}

	public static boolean isPrime(int x) {
		for (int i = 2; i < x; i++) {
			if (x % i == 0)
				return false;
		}
		return true;

	}
}
