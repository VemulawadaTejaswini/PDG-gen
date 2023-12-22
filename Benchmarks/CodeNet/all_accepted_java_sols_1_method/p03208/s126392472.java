import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int []a = new int [n];
		int []b = new int [n-1];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		   Arrays.sort(a);
		for(int i = 0; i < n-1;i++) {
			b[i] = Math.abs(a[i + 1] - a[i]);
		}
		int min = 1000000000;
		
		for(int i = 0; i < n - k + 1 ; i++) {
			int sum = 0;
			for(int j = 0; j < k - 1; j++) {	
				sum += b[i + j];
			}
			min = Math.min(sum, min);
		}
		System.out.println(min);

	}

}
