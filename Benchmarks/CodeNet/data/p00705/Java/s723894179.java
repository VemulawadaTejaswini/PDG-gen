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
			int Q = scn.nextInt();
			int[] D = new int[101];
			if(N==0&&Q==0) break;
			for(int k=0;k<N;k++){
				int M = scn.nextInt();
				for(int s=0;s<M;s++){
					D[scn.nextInt()]++;
				}
			}
			int max = Q-1;
			int maxd = 0;
			for(int s=0;s<101;s++){
				if(D[s]>max){
					max = D[s];
					maxd = s;
				}
			}
			pr.println(maxd);
			
		}
		pr.flush();
		scn.close();
	}

}