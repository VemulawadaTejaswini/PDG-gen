import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] h = new int[n];
		int[] max = new int[n]; 
		for(int i = 0; i < n; i++) {
			h[i] = scan.nextInt();
			max[i] = 0;
		}
		
		for(int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			max[a-1] = Math.max(max[a-1], h[b-1]);
			max[b-1] = Math.max(max[b-1], h[a-1]);
		}
		
		int ans = 0;
		for(int i = 0; i < max.length; i++) {
			if(h[i] > max[i]) {
				ans++;
			}
		}
		System.out.print(ans);
		
	}

}
