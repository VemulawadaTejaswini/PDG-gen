import java.util.*;
import java.util.Map.Entry;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for(int i=0;i<n;i++) {
			String s = sc.next();
			if(map.containsKey(s))
				map.put(s, map.get(s)+1);
			else
				map.put(s, 1);
		}
		
		int max = 0;
		for(Entry<String, Integer> e: map.entrySet()) {
			String key = e.getKey();
			int vote = e.getValue();
			if(vote>max)
				max = vote;
		}
		
		StringBuilder ans = new StringBuilder();
		for(Entry<String, Integer> e: map.entrySet()) {
			String key = e.getKey();
			int vote = e.getValue();
			if(vote==max)
				ans.append(key+"\n");
		}
		
		System.out.print(ans);
	}
}