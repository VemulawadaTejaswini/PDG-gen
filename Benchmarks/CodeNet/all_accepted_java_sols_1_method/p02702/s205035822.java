import java.util.*;
 
public class Main {
    public static void main(String[] args){
		int mod = 2019;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		int[] a = new int[s.length()+1];
		a[0] = 0;
		int x = 1;
		for(int i=0; i<s.length(); i++){
			int tmp = (sb.charAt(i) - '0')*x;
			a[i+1] = (a[i] + tmp)%mod;
			x = x*10%mod;
		}
		Map<Integer, Integer> map = new HashMap<>();
		for(int i: a){
			Integer t = map.get(i);
			if(t == null){
				map.put(i, 1);
			} else {
				map.put(i, t+1);
			}
		}
		int ans = 0;
		for (Integer v : map.values()) {
			if(v > 1){
				ans += v*(v-1)/2;
			}
		}
		System.out.println(ans);
	}
}
