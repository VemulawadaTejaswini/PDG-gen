import java.util.*;
import java.awt.Point;

public class Main{
	private static final int MAX = 9999999;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0) break;

			Point sp = null, gp = null; //X^[g,S[
			ArrayList<ArrayList<Point>> map = new ArrayList<ArrayList<Point>>(); //®«1~5ÌêðL¯µ½}bv
			for(int i=0;i<5;i++) map.add(new ArrayList<Point>());

			for(int i=0;i<h;i++){
				char[] s = sc.next().toCharArray();
				for(int j=0;j<w;j++){
					if(s[j] == 'S'){
						sp = new Point(j,i);
					}
					else if(s[j] == 'G'){
						gp = new Point(j,i);
					}
					else if(s[j] != '.'){
						map.get(s[j] - '1').add(new Point(j,i));
					}
				}
			}

			int first = -1; //Í¶ßÉQbg·×«®«
			int ans = MAX; //Å¬RXg

			//ÅÉQbg·é®«ðè
			for(int start=0;start<5;start++){
				int[][] dp = new int[5][1000];
				for(int i=0;i<5;i++) Arrays.fill(dp[i],MAX);
				int next = (start + 1) % 5;

				for(int i=0;i<map.get(next).size();i++){
					dp[next][i] = dist(sp,map.get(next).get(i));
				}

				int now = next;
				for(;now!=(start+4)%5;now=(now+1)%5){
					for(int i=0;i<map.get(now).size();i++){
						next = (now + 1) % 5;
						for(int j=0;j<map.get(next).size();j++){
							dp[next][j] = Math.min(dp[next][j], dp[now][i]+dist(map.get(now).get(i),map.get(next).get(j)));
						}
					}
				}

				for(int i=0;i<map.get(now).size();i++){
					int d = dp[now][i] + dist(map.get(now).get(i), gp);
					if(ans > d){
						ans = d;
						first = start;
					}
				}
			}

			if(first == -1) System.out.println("NA");
			else System.out.println((first+1) + " " + ans);
		}
	}

	private static int dist(Point a,Point b){
		return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
	}
}