import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int r = scan.nextInt();
		int d = scan.nextInt();
		int ans = 0;
		for(int i = l; i < r+1; i++) {
			if(i % d == 0) {
				ans++;
			}
		}
		System.out.print(ans);
	}

}
