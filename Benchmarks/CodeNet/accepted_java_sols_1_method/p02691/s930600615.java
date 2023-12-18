import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] as = new long[n];
		long[] plus = new long[n];
		long[] minus = new long[n];
		for(int i=0; i<n; i++){
			as[i] = sc.nextLong();
			plus[i] = i+1+as[i];
			minus[i] = i+1-as[i];
		}
		Map<Long, Integer> map = new HashMap<>();
		for(long i: minus){
			Integer value = map.get(i);
			if(value == null) map.put(i, 1);
			else map.put(i, value+1);
		}
		long ans = 0;
		for(long i: plus){
			Integer value = map.get(i);
			if(value != null){
				ans += value;
			}
		}
		System.out.println(ans);
	}
}
