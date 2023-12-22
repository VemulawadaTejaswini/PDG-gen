
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length()+1;
		

		List<Integer> l2 = new ArrayList<Integer>();
		for(int i=0;i<N;i++) l2.add(-1);
		
		List<Integer> memos = new ArrayList<Integer>(); 
		if(S.charAt(0)=='<') {
			l2.set(0,0);
			memos.add(0);
		}
		for(int i=1;i<N-1;i++) {
			if(S.charAt(i-1)=='>'&&S.charAt(i)=='<') {
				l2.set(i, 0);
				memos.add(i);
			}
		}
		if(S.charAt(N-2)=='>') {
			l2.set(N-1,0);
			memos.add(N-1);
		}
		
		int size = memos.size();

		for(int tmp:memos) {
			for(int i=tmp;i>0;i--) {
				int now = l2.get(i);
				if(S.charAt(i-1)=='>') l2.set(i-1,Math.max(now+1,l2.get(i-1)));else break;
			}
			for(int i=tmp;i<N-1;i++) {
				int now = l2.get(i);
				if(S.charAt(i)=='<') l2.set(i+1,Math.max(now+1,l2.get(i+1)));else break;	
			}
		}

		long ans = 0;
		for(int tmp:l2) {
			ans += tmp;
		}
	
		System.out.println(ans);
		
	}
}
