import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();

		int[] num = new int[w + 1];
		for (int i = 1; i < (w + 1); i++) {
			num[i] = i;
		}

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			String[] ab = str.split(",");
			int a = Integer.parseInt(ab[0]);
			int b = Integer.parseInt(ab[1]);
			int save = num[b];
			num[b] = num[a];
			num[a] = save;
		}

		for (int i = 1; i < w + 1; i++) {
			System.out.println(num[i]);
		}
	}
}