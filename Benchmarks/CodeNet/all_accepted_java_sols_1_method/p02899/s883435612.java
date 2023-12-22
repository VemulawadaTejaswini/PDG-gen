import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 1; i < n + 1; i++)
			a[i] = sc.nextInt(); //出席番号iの生徒が入室したときに教室にいる人数
		sc.close();

		int[] ans = new int[n + 1];

		for (int i = 1; i < n + 1; i++)
			ans[a[i]] = i;
		for (int i = 1; i < n + 1; i++)
			System.out.print(ans[i] + " ");

	}
}