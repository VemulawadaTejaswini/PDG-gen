import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int mod = 998244353;
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		ArrayList<Integer> L = new ArrayList<Integer>();
		ArrayList<Integer> R = new ArrayList<Integer>();
		for(int i = 0; i < K; i ++) {
			L.add(stdIn.nextInt());
			R.add(stdIn.nextInt());
		}
		
		ArrayList<Integer> S = new ArrayList<Integer>();
		for(int i = 0; i < K; i ++) {
			for(int j = L.get(i); j <= R.get(i); j ++) {
				if(!S.contains(j)) {
					S.add(j);
				}
			}
		}
		
		ArrayList<Long> A = new ArrayList<Long>();
		for(int i = 1; i < N; i ++) {
			long addNum = (long) 0;
			for(int j = 0; j < S.size(); j ++) {
				if(0 < i - S.get(j)) {
					addNum += (A.get(i - S.get(j) - 1));
				}
				if(i == S.get(j)) {
					addNum = (addNum + 1);
				}
			}
			A.add(addNum);
		}
		
		System.out.println(A.get(A.size() - 1) % mod);
	}
}
