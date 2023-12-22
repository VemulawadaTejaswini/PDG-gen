import java.util.*;
public class Main {
	public static void main(String[] args) {
		boolean result = true;
		//出発地点の初期化
		int t0 = 0, x0 = 0, y0 = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			//目的地の更新
			int t1 = sc.nextInt();
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			
			int t = t1-t0;
			int d = distance(x0,x1,y0,y1);
			//時間内に届くかを判定
			if (t < d) {
				result = false;
				break;
			}
			//偶奇が一致するか判定
			if (((t^d)&1)==1) {
				result = false;
				break;
			}
			//出発地点の更新
			t0 = t1;
			x0 = x1;
			y0 = y1;
		}
		System.out.println(result ? "Yes" : "No");
	}
	
	//2地点のマンハッタン距離を返す
	public static int distance(int x1, int x2, int y1, int y2) {
		x1 -= x2;
		y1 -= y2;
		if (x1<0)
			x1 *= -1;
		if (y1<0)
			y1 *= -1;
		return x1+y1;
	}
}
