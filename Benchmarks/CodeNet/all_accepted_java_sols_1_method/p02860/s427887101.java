import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		sc.close();

		if(n % 2 != 0) {
			System.out.println("No");
			return;
		}

		int e = n / 2;

		if(s.subSequence(0, e).equals(s.substring(e, s.length()))) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
