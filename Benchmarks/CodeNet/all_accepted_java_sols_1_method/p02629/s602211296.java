import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = "";

		long n = scanner.nextLong();
		while (n-- > 0){
			s = (char)('a' + (n%26)) + s;
			n /= 26;
		}
		System.out.println(s);
	}

}
