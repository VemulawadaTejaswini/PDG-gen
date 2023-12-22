import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		String s = sc.next();
		int k = parseInt(sc.next());
		sc.close();
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for (i = 0; i < 26; i++) {
			list.add(new ArrayList<Integer>());
		}
		for (i = 0; i < s.length(); i++) {
			list.get((s.charAt(i)-'a')).add(i);
		}
		TreeSet<String> set = new TreeSet<>();
		for (int l = 0; l < 26; l++) {
			for (Integer ii:list.get(l)) {
				for (j = ii+1; j <= Math.min(ii+5,s.length()); j++) {
					set.add(s.substring(ii, j));
				}
			}
			if(set.size()>=5) break;
		}
		String ans = null;
		for (i = 0; i < k; i++) {
			ans=set.pollFirst();
		}
		out.println(ans);
	}
}