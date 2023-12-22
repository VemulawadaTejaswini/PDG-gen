import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int []a = new int[n];

		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}

		Arrays.parallelSort(a);

		System.out.println(a[n/2]-a[n/2-1]);
	}

}
