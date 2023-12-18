import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int p = sc.nextInt();
		boolean[] b = new boolean[n * 2];
		
		for (int i = 0; i < m; i++){
			int d = sc.nextInt();
			b[d] = true;
			b[d + n] = true;
		}
		
		java.util.ArrayDeque<Integer> dq = new ArrayDeque<>();
		
		for (int i = 0; i < n; i++){
			if (b[i]){
				dq.addLast(i);
			}
		}
		
		int res = 1 << 28;
		for (int i = 0; i < n; i++){
			if (p < i) p += n;
			if (p < dq.getFirst() && p < dq.getLast()){
				int t = Math.max(dq.getFirst(), dq.getLast());
				res = Math.min(res, t - p);
			}
			else if (p > dq.getFirst() && p > dq.getLast()){
				int t = Math.min(dq.getFirst(), dq.getLast());
				res = Math.min(res, p - t);
			}
			else {
				int s = dq.getFirst();
				int t = dq.getLast();
				int ans = Math.min((p - s) + (t - s), (t - p) + (t - s));
				res = Math.min(res, ans);
			}
			
			while (dq.getFirst() < i){
				dq.removeFirst();
			}
			if (b[i + n]){
				dq.addLast(i + n);
			}
		}
		
		System.out.println(res * 100);
	}
}