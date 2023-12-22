
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String air = s.nextLine();
		String c = s.nextLine();
		int ans = 0;

		int a = 0;
		int b = 0;
		int now = 0;

		//全部Wにするとき
		for(int i=0; i<n; i++) {
			if(c.charAt(i) == 'R') {
				a++;
			}
			ans = a;
		}

		//端からRを増やしていくとき
		for(int i=0; i<n; i++) {
			if(c.charAt(i) == 'R') {
				a--;
			}else {
				b++;
			}
			now = Math.max(a, b);
			ans = Math.min(now, ans);
		}

		System.out.println(ans);

	}

}
