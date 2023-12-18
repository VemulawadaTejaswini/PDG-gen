import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<N; i++) {
			int a = sc.nextInt();
			Integer count = map.get(a);
			if(count==null)
				count = 0;
			map.put(a, count+1);
		}
		
		int ans = 0;
		for(Integer key : map.keySet()) {
			if(map.get(key)<key)
				ans += map.get(key);
			else
				ans += (map.get(key) - key);
		}
		
		System.out.println(ans);
				
		sc.close();
	}
}
