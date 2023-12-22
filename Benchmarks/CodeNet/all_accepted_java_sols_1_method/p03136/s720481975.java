import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[]a = new int [n];
		int sum = 0;
		for(int i= 0; i < n ; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		Arrays.parallelSort(a);
		sum -= a[n-1];
		
		if (sum > a[n-1])
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
