import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Long> pq = new PriorityQueue<>();
		for(int i=0; i<n; i++){
			pq.add(sc.nextLong()); 
		}
		Map<Long, Integer> map = new TreeMap<>(Comparator.reverseOrder());
		for(int i=0; i<m; i++){
			int b = sc.nextInt();
			long c = sc.nextLong();
			Integer tmp = map.get(c);
			if(map.get(c) == null){
				map.put(c, b);
			} else {
				map.put(c, b+tmp);
			}
		}
		for (Map.Entry<Long, Integer> kv : map.entrySet()) {
			Long key = kv.getKey();
			Integer count = kv.getValue();
			for(int i=0; i<count; i++){
				Long target = pq.poll();
				if(target<key){
					pq.add(key);
				} else {
					pq.add(target);
					break;
				}
			}
		}
		long ans = 0;
		while(pq.size() > 0){
			ans += pq.poll();
		}
		System.out.println(ans);
	}
}
