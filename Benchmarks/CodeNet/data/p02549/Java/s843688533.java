import java.awt.*;
import java.io.*;
import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new TestB().doIt();
	}
	class TestB{
		void doIt() {
			int N = sc.nextInt();
			int K = sc.nextInt();
			ArrayList<Integer> move = new ArrayList<Integer>();
			for(int i = 0;i < K;i++) {
				int L = sc.nextInt();
				int R = sc.nextInt();
				for(int j = L;j <= R;j++) {
					move.add(j);
				}
			}
			Collections.sort(move);
			long DP[] = new long[N+1];
			DP[1] = 1;
			int length = move.size();
			for(int i = 1;i < N;i++) {
				for(int j = 0;j < length;j++) {
					int d = i + move.get(j);
					if(d > N)break;
					else {
						DP[d] = (DP[i] + DP[d]) % 998244353;
					}
				}
			}
			System.out.println(DP[N]);
		}
	}
}