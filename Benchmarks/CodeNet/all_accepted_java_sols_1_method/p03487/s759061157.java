import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int n = Integer.parseInt(sc.next());
		long[] a = new long[n];
		Map<Long, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            a[i] = Long.parseLong(sc.next());
            if(map.containsKey(a[i])) map.put(a[i], map.get(a[i])+1);
            else map.put(a[i], 1);
        }
        long ans = 0;
        for(Long key : map.keySet()) {
            if(map.get(key) >= key) ans += map.get(key)-key;
            else ans += map.get(key);
        }
        System.out.println(ans);
	}
}