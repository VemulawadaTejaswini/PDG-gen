import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		double total = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			total += a[i];
		}
		for (int i = 0; i < n; i++) {
			if (total / 4 / m <= a[i]) {
				count++;
			}
		}
		if (count < m)
			System.out.println("No");
		else
			System.out.println("Yes");
	}

}