import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //問題数
		int [] t = new int[n]; //それぞれの問題にかかる時間
		for(int i = 0; i < n; i++) {
			t[i] = stdIn.nextInt();
		}
		int m = stdIn.nextInt(); //ドリンクの数
		int[] p = new int[m]; //どの問題のドリンクか
		int[] x = new int[m]; //ドリンクを飲んだ時に短縮できる時間
		
		for(int i = 0; i < m; i++) {
			p[i] = stdIn.nextInt();
			x[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i < m; i++) {
			int[] b = t.clone();
			int ans = 0;
			
			b[p[i]-1] = x[i];
					
			for(int j = 0; j < n; j++) {
				ans += b[j];
			
			}
			
			System.out.println(ans);
		}
		
		
		
	}

}
