
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		int now=0;
		Map<String,Integer> s = new HashMap<>();
		Map<String,Integer> t = new HashMap<>();

		for(int i=0;i<n;i++) {
			String word = sc.next();
			if(s.get(word)==null) {
				s.put(word,1);
			}else {
				s.put(word,s.get(word)+1);
			}
		}
		int m = sc.nextInt();
		for(int i=0;i<m;i++) {
			String word = sc.next();
			if(t.get(word)==null) {
				t.put(word,1);
			}else {
				t.put(word,t.get(word)+1);
			}
		}

		for(String key : s.keySet()) {
			if(t.containsKey(key)) {
				now=s.get(key)-t.get(key);
			}else {
				now=s.get(key);
			}
			if(ans<now) {
				ans=now;
			}
		}
		System.out.println(ans);
	}
}
