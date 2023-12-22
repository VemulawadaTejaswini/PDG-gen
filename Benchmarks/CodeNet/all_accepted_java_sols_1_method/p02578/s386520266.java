import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		long ans = 0;
		
		for(int i = 1; i < n; i++) {
			if(a[i-1] > a[i]) {
				ans += a[i-1] - a[i];
				a[i] = a[i-1];
			}
		}
		
		System.out.println(ans);
		

	}

}
