import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int m = sc1.nextInt();
		int x = sc1.nextInt();
		int[] a = new int[m];
		int cost1 = 0;
		int cost2 = 0;

		for (int i = 0 ; i < m ; i++ ) {
			a[i] = sc1.nextInt();
			if (a[i] < x) {
				cost1++;
			}
			else if (a[i] > x) {
				cost2++;
			}
		}

		if (cost1 < cost2) {
			System.out.println(cost1);
		}
		else {
			System.out.println(cost2);
		}

		sc1.close();
	}

}
