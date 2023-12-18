import java.util.*;
import java.awt.geom.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1237();
	}
	
	class AOJ1237{
		AOJ1237(){
			while(true){
				target = sc.nextInt();
				seq = sc.next();
				if(target==0)	break;
				solve();
			}
		}
		int target,ans;
		int[] alist;
		boolean valid;
		String seq;
		void solve(){
			
			valid=true;
			ans=-1;
			alist=new int[seq.length()];
			for(int i=0; i<alist.length; ++i)	alist[i]=-1;
			
			dfs(new int[seq.length()], seq, 0, 0);
			if(ans<0)	System.out.println("error");
			else if(!valid)	System.out.println("rejected");
			else{
				System.out.print(ans);
				for(int i=0; i<alist.length; ++i)if(alist[i]>=0)	System.out.print(" "+alist[i]);
				System.out.println();
			}
		}
		void dfs(int[] list,String remain,int sum,int depth){
			int cur=Integer.parseInt(remain);
			if(sum+cur <= target){
				if(sum+cur == ans)	valid=false;
				if(sum+cur > ans){
					valid = true;
					ans = sum+cur;
					for(int i=0; i<depth; ++i)	alist[i]=list[i];
					alist[depth]=cur;
					for(int i=depth+1; i<list.length; ++i)	alist[i]=-1;
				}
			}
			
			
			for(int i=1; i<=remain.length(); ++i){
				String	l=remain.substring(0, i),
						r=remain.substring(i);
				if(r.isEmpty())	continue;
				cur = Integer.parseInt(l);
				if(sum+cur > target)	continue;
				list[depth] = cur;
				dfs(list, r, sum+cur, depth+1);
			}
		}
	}
}