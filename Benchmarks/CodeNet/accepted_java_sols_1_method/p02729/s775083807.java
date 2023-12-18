import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt() - 1;
		int m = sc.nextInt() - 1;

		int pattern = 0;

		for(int i = n; i > 0; i--)
		{
			pattern += i;
		}

		for(int i = m; i > 0; i--)
		{
			pattern += i;
		}

		System.out.println(pattern);

	}
}
