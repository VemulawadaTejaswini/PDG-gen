import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for(int k = n-1; k >= 0; k--)
			if (k != 0) System.out.print(a[k] + " ");
			else System.out.println(a[k]);
	}
}
