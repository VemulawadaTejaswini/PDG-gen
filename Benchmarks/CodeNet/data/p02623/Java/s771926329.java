import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		long k = scan.nextLong();
		
		Queue<Integer> N = new ArrayDeque<Integer>();
		Queue<Integer> M = new ArrayDeque<Integer>();
		
		for(int i = 0; i < n; i++) {
			N.add(scan.nextInt());
		}
		for(int i = 0; i < m; i++) {
			M.add(scan.nextInt());
		}
		
		long ans = 0;
		long tmp = 0;
		int cnt = 0;
		
		while(true) {
			
			if(N.peek() == null && M.peek() == null) {
				 break;
			}
			if(N.peek() == null) {
				tmp = M.poll();
				//System.out.println(tmp);
				if(k-tmp < 0) {
					break;
				}
				k -= tmp;
				cnt++;
				continue;
			}
			if(M.peek() == null) {
				tmp = N.poll();
				//System.out.println(tmp);
				if(k-tmp < 0) {
					break;
				}
				k -= tmp;
				cnt++;
				continue;
			}
			
			if(N.peek() < M.peek()) {
				tmp = N.poll();
				//System.out.println(tmp);
				if(k-tmp < 0) {
					break;
				}
				k -= tmp;
				cnt++;
			}
			else if(N.peek() > M.peek()) {
				tmp = M.poll();
				//System.out.println(tmp);
				if(k-tmp < 0) {
					break;
				}
				k -= tmp;
				cnt++;
			}
			else {
				tmp = N.poll();
				//System.out.println(tmp);
				if(k-tmp < 0) {
					break;
				}
				k -= tmp;
				cnt++;
			}
		}
		//System.out.println(ans);
		System.out.print(cnt);
		
	}

}



