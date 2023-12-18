import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = sc.nextLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		// List<String> list = Arrays.asList(sc.nextLine().split(" "));

		// int min = list.stream().mapToInt(Integer::parseInt).min().getAsInt();

		// long count = list.stream().mapToInt(Integer::parseInt).filter(i -> i > min).count();

		int b = k - 1;
		int ans = (n - 1) / b;
		if ((n - 1) % b != 0) {
			ans++;
		}
		System.out.println(ans);

	}

}
