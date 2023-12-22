import java.util.*;
import java.math.*;
public class Main {
	static int x;
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		Map<Integer, Integer> map = new HashMap<>();
		int[] a = new int[N];
		int[] b = new int[N];
		
		for(int i=0; i<N; i++) {
		    a[i] = Integer.parseInt(sc.next());
		    b[i] = Integer.parseInt(sc.next());
		    if(map.containsKey(b[i])) {
		        map.put(b[i], map.get(b[i])+a[i]);
		    }else {
		        map.put(b[i], a[i]);
		    }
		}
	
		Object[] mapkey = map.keySet().toArray();
        Arrays.sort(mapkey);
        
		String ans = "Yes";
		long sum = 0;
		for(Object ob : mapkey) {
		    String s = ob.toString();
		    int key = Integer.parseInt(s);
		    sum += map.get(key);
		    if(sum > key) {
		        ans = "No";
		        break;
		    }
		}
        System.out.println(ans);
	}
} 