import java.util.Arrays;
import java. util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		Integer a[] = new Integer[n];

		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}

		Arrays.sort(a);

		int total = 0;

		for(int i=0;i<k;i++) {
			total = total + a[i];
		}
		System.out.println(total);

	}

}
