import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = 0;
		int x = 0;
		int y = 0;
		for(int i=0;i<n;i++) {
			int nextt = sc.nextInt();
			int nextx = sc.nextInt();
			int nexty = sc.nextInt();
			
			int dt = nextt - t;
			int dist = Math.abs(nextx-x) + Math.abs(nexty-y);
			if(dt<dist || ((dist-dt)%2 != 0)) {
				System.out.println("No");
				return;
			}
			t = nextt;
			x = nextx;
			y = nexty;
		}
		System.out.println("Yes");
	}

}