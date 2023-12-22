import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(!isValid(a)) {
				System.out.println("DENIED");
				return;
			}
		}
		System.out.println("APPROVED");
	}

	private static boolean isValid(int num) {
		if(num % 2 != 0) {
			return true;
		}

		if(num % 3 == 0) {
			return true;
		}

		if(num % 5 == 0) {
			return true;
		}

		return false;
	}
}