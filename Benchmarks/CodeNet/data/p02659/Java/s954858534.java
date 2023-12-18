
	import java.util.Scanner;

	public class Main {

		static long mod = 1000000007;

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String[] t = sc.nextLine().split(" ");
			long n = Long.parseLong(t[0]);
			long k = Long.parseLong(t[1].replaceAll("\\.", ""));

			System.out.println(n * k / 100);
		}
	}
