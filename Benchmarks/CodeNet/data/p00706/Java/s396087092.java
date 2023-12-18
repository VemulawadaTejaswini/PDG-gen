import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner scn = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		while(true){
			int N = scn.nextInt();
			if(N==0) break;
			int W = scn.nextInt();
			int H = scn.nextInt();
			int[][] map = new int[W+1][H+1];
			while(N-->0){
				map[scn.nextInt()][scn.nextInt()]++;
			}
			int S = scn.nextInt();
			int T = scn.nextInt();
			int max=0;
			for(int s=1;s<=W-S+1;s++){
				for(int t=1;t<=H-T+1;t++){
					int count=0;
					for(int a=s;a<s+S;a++){
						for(int b=t;b<t+T;b++){
							count+=map[a][b];
						}
					}
					if(max<count){
						max = count;
					}
				}
			}
			pr.println(max);
		}
		pr.flush();
		scn.close();
	}

}