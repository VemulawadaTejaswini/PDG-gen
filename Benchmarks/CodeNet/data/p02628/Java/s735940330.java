import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Integer[] array = new Integer[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		int ans = 0;


		Arrays.sort(array);
		int len = Math.min(array.length, k);
		for(int i=0;i<len;i++){
			ans = ans + array[i];
		}


		System.out.println(ans);

	}
}
