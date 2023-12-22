//B
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),T = sc.nextInt();
		int mincost = 1001,c,t;//,cnt = 0;
		for(int i = 0;i < N;i ++) {
			c = sc.nextInt(); t = sc.nextInt();
			if(t <= T && mincost > c) {
				mincost = c;
				//cnt++;
			}
		}
		if(mincost == 1001) System.out.println("TLE");
		else System.out.println(mincost);
	}
}