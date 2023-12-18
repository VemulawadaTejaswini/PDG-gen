import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		sc.close();

		int l = x - k + 1;
		int r = x + k;
		StringBuilder sb = new StringBuilder();
		for (int i = l; i < r; i++) {
			sb.append(i).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
