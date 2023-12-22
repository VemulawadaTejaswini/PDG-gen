import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		int i = 0;
		String ans = "";

		while (true) {

			if (n <= 26){
				ans = (char) (96 + n) + ans;
				break;
			}

			long mod = n % 26;
			n = n / 26;

			if (mod == 0){
				mod = 26;
				n--;
			}

			char c = (char) (96 + mod);
			ans = c + ans;

			i++;

		}
		System.out.println(ans);
	}

}