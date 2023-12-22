import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String[] str2 = sc.nextLine().split(" ");

		int n = Integer.parseInt(str1);
		int d = Integer.parseInt(str2[0]);
		int x = Integer.parseInt(str2[1]);

		for (int i = 0; i < n; i++) {
			String stra = sc.nextLine();
			int a = Integer.parseInt(stra);

			int choco = (d - 1) / a;
			x += choco;

		}
		x += n;

		System.out.println(x);

		sc.close();
	}

}
