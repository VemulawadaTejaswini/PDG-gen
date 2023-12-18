import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new AOJ1148().doIt();
	}
	class AOJ1148{
		void doIt(){
			while(true) {
				int PC[][] = new int[10001][1500];
				int N = sc.nextInt();
				int M = sc.nextInt();
				if(N + M == 0)break;
				int r = sc.nextInt();
				for(int i = 0;i < r;i++) {
					int t = sc.nextInt();
					int n = sc.nextInt();
					int m = sc.nextInt();
					int s = sc.nextInt();
					if(s == 1)PC[m][t]++;
					else PC[m][t]--;
				}
				for(int i = 1;i <= M;i++) {
					for(int j = 500;j < 1500;j++) {
						PC[i][j] = PC[i][j] + PC[i][j-1];
					}
				}
				int q = sc.nextInt();
				for(int i = 0;i < q;i++) {
					int ts = sc.nextInt();
					int te = sc.nextInt();
					int m = sc.nextInt();
					int cnt = 0;
					for(int pos = ts;pos < te;pos++) {
						if(PC[m][pos] > 0) {
							cnt++;
						}
					}
					System.out.println(cnt);
				}
			}
		}
	}
}

