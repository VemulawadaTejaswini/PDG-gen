import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			if(n == 0 && k == 0) break;

			String[] card = new String[n];
			for(int i=0;i<n;i++){
				card[i] = sc.next();
			}

			HashSet<String> set = new HashSet<String>();
			solve(card,k,new boolean[n],set,"");
			System.out.println(set.size());
		}
	}

	private static void solve(String[] card,int k,boolean[] used,HashSet<String> set,String s){
		if(k == 0){
			set.add(s);
			return;
		}

		for(int i=0;i<card.length;i++){
			if(!used[i]){
				used[i] = true;
				solve(card,k-1,used,set,s+card[i]);
				used[i] = false;
			}
		}
	}
}