import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();// Nは読み捨て
		int m = sc.nextInt();
		int x = sc.nextInt();
		sc.nextLine();// 改行読み捨て
		String[] a = sc.nextLine().split(" ");
		int leftCost = 0;
		for (String s : a) {
			if (Integer.parseInt(s) < x) {
				leftCost++;
			} else {
				break;
			}
		}

		System.out.println(Math.min(leftCost, m - leftCost));

		sc.close();
	}
}