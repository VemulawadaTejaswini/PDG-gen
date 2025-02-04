
import java.util.*;
import java.util.Map.Entry;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long k=sc.nextLong();
		Map<Integer,Long> map= new HashMap<Integer,Long>();
		for (int i = 0; i < N; i++) {
			int res = sc.nextInt();
			int count = sc.nextInt();
			map.put(res, map.getOrDefault(res, (long) 0)+count);
		}
		List<Entry<Integer, Long>> l=new ArrayList<Entry<Integer, Long>>();
		
		for(Entry<Integer, Long> e:map.entrySet()){
			l.add(e);
		}
		Collections.sort(l,(a,b)->(a.getKey()-b.getKey()));
		
		for(Entry<Integer, Long> e:l){
			k-=e.getValue();
			if(k<=0) {
				System.out.println(e.getKey());
				break;
			}
		}
	}
}
