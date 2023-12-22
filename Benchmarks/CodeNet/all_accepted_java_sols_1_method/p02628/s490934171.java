import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];
		
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		
		Arrays.sort(p);
		int count = 0;
		for(int i = 0; i < k; i++) {
			count += p[i];
		}
		
		System.out.println(count);
	}

}
