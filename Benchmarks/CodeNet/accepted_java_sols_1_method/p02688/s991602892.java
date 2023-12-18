import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		boolean[] judge = new boolean[n];
		
		for( int i = 0; i < k; i++) {
			int d = scan.nextInt();
			for(int j = 0; j < d; j++) {
				int a = scan.nextInt();
				judge[a-1] = true;
			}
		}
		int ans = 0;
		for(int i = 0; i < judge.length; i++) {
			if(judge[i] == false) {
				ans++;
			}
		}
		System.out.print(ans);
		
	}

}
