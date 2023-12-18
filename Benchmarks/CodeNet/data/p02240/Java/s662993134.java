import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Sns sns = new Sns(n);

		int m = scan.nextInt();
		for(int i = 0; i < m; i++)
			sns.addRel(scan.nextInt(), scan.nextInt());

		int q = scan.nextInt();
		for(int i = 0; i < q; i++)
			if(sns.isFriends(scan.nextInt(), scan.nextInt()))
				System.out.println("yes");
			else
				System.out.println("no");

		scan.close();
		System.exit(0);
	}
}

class Sns{

		int[] leader;
		int[] member;

		public Sns(int n){
			leader = new int[n];
			member = new int[n];
			for(int i = 0; i < n; i++){
				leader[i] = i;
				member[i] = 1;
			}
		}

		public boolean isFriends(int s, int t){
			if(top(s) == top(t))
				return true;
			else
				return false;
		}
		private int top(int s){
			if(leader[s] == s)
				return s;
			else
				return top(leader[s]);
		}

		public void addRel(int s, int t){
			if(isFriends(s, t))
				return;
			int tt = top(t);
			int st = top(s);
			if(member[st] < member[tt]){
				leader[st] = tt;
				member[tt] += member[st];
			}else{
				leader[tt] = st;
				member[st] += member[tt];
			}
		}
}