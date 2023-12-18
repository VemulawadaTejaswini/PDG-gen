import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] as = new long[n];
		long sum = 0;
		for(int i=0; i<n; i++){
			as[i] = sc.nextInt();
			sum += as[i];
		}
		Map<Long, Long> map = new HashMap<>();
		for (Long key : as) {
    		Long i = map.get(key);
    		map.put(key, i == null ? 1 : i + 1);
		}
		int q = sc.nextInt();
		long ans[] = new long[q];
		for(int i=0; i<q; i++){
			long from = sc.nextInt();
			long to = sc.nextInt();
			Long value = map.get(from);
			if(value == null) value = 0L;
			sum -= value*(from-to);
			ans[i] = sum;
			map.remove(from);
			Long j = map.get(to);
			map.put(to, j == null ? value : j + value);
		}
		for(long i: ans){
			System.out.println(i);
		}
	}
}
