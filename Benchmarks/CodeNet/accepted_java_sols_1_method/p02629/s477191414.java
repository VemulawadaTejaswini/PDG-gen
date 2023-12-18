import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		StringBuilder ans = new StringBuilder();

		while(0 < n) {
			n--;
			ans.append((char) (n % 26 + 97));
			n /= 26;
		}

		System.out.println(ans.reverse());
		sc.close();
	}

}