import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int num = sc.nextInt();

			int[] values = new int[num];
			int count = 0;

			for(int i = 0; i < values.length; i++) {
				values[i] = sc.nextInt();

				if(isPrime(values[i])) {count++;}
			}

			System.out.println(count);
		} catch(InputMismatchException ex) {
			ex.printStackTrace();
		} finally {
			sc.close();
		}
	}

	private static boolean isPrime(int val) {
		if(val == 2 || val == 3) {return true;}
		if(val % 2 == 0) {return false;}

		for(int i = 3; i <= Math.sqrt((double)val); i += 2) {
			if(val % i == 0) {return false;}
		}

		return true;
	}
}

