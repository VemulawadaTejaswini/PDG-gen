import java.util.*;

public class Main {
	static boolean arive=false;
	static int t[];
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(); t=new int[n];
		
		for(int i=0;i<n;i++)t[i]=Integer.parseInt(in.next());
		
		String res;
		solve(0,'p');
		if(arive) {
			arive=false;
			solve(n-1,'r');
			if(arive)res="yes";
			else res="no";
		}
		else res="no";
		System.out.println(res);

	}
	
	static void solve(int u,char odr) {
		Queue<Integer> q=new ArrayDeque<>();
		q.add(u);
		while(!q.isEmpty()) {
			int n=q.remove();
			//System.out.println(n);
			if((odr=='p' && n==t.length-1) || (odr=='r' && n==0)) {
				arive=true;
				return;
			}
			int v=t[n]/10;
			
			if(odr=='p') {
				for(int i=v;i>0;i--) {
					if(n+i>=t.length)continue;
					q.add(n+i);
				}
			}
			else {
				for(int i=v;i>0;i--) {
					if(n-i<0)continue;
					q.add(n-i);
				}
			}
		}
	}

}

