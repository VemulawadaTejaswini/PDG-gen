import java.util.*;

public class Main{
	public static void main(String[] args){
		HashSet<Integer> s = new HashSet<Integer>();
		HashSet<Integer> ans = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			s.add(a);
			ans.add(a);
		}
		int q = sc.nextInt();
		for(int i = 0; i < q; i++){
			s.remove(sc.nextInt());
		}
		Iterator it = s.iterator();
		while(it.hasNext()){
			ans.remove(it.next());
		}
		System.out.println(ans.size());
	}
}