import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;

			ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
			for(int i=0;i<=n;i++){
				al.add(new ArrayList<Integer>());
			}
			for(int i=0;i<m;i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				al.get(a).add(b);
				al.get(b).add(a);
			}

			HashSet<Integer> ans = new HashSet<Integer>();
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			ans.addAll(al.get(1));
			tmp.addAll(al.get(1));

			for(int x : tmp){
				ans.addAll(al.get(x));
			}

			ans.remove((Integer)1);
			System.out.println(ans.size());
		}
	}
}