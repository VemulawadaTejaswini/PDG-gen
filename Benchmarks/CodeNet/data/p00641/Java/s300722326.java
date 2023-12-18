import java.util.*;
import java.awt.Point;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			Point[][] map = new Point[n][2];
			for(int i=0;i<n;i++){
				map[i][0] = new Point(sc.nextInt(),sc.nextInt());
				map[i][1] = new Point(sc.nextInt(),sc.nextInt());
			}

			long ans = 1;
			boolean[] flg = new boolean[n];
			for(int i=0;i<n;i++){
				max = Long.MIN_VALUE;
				if(!flg[i]) ans *= getPattern(map,flg,i);
			}

			System.out.println(ans%10007);
		}
	}

	static long max;

	public static long getPattern(Point[][] map,boolean[] flg,int index){
		flg[index] = true;

		max = Math.max(max,Math.max(map[index][0].y,map[index][1].y));

		int a = map[index][0].x, b = map[index][1].x;
		long res = 0;
		int nextIndex = flg[a] ? flg[b] ? -1 : b : a;

		if(nextIndex == -1){
			if(map[index][a<=b ? 0 : 1].y == max) return 1;
			return 0;
		}

		res += getPattern(map,flg,nextIndex);
		if(max == map[index][map[index][0].x==nextIndex?0:1].y) res++;

		return res;
	}
}