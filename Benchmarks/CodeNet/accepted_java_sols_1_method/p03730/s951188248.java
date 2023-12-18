import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		String ans = "NO";

		int i = a;
		int j=1;

		for (i = a; i <= 10000000; i = i * j) {
			if (i % b == c) {
				ans = "YES";
				break;
			}

			j++;
			i=a;
		}

		System.out.println(ans);

	}

}