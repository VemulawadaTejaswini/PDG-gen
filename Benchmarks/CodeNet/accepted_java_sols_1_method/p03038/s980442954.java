import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Map<Long,Long> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			long tmp = in.nextInt();
			if(map.containsKey(tmp)) map.put(tmp, map.get(tmp)+1);
			else map.put(tmp, 1L);
		}
		for(int i=0;i<m;i++) {
			long b = in.nextLong();
			long c = in.nextLong();
			if(map.containsKey(c)) map.put(c, map.get(c)+b);
			else map.put(c, b);
		}
		List<Long> list = new ArrayList<>();
		for(long key : map.keySet()) list.add(key);
		list.sort((e1,e2)->e1>e2?-1:1);
		long ans = 0;
		int idx = 0;
		while(true) {
			if(n-map.get(list.get(idx))>0) {
				ans += map.get(list.get(idx)) * list.get(idx);
				n -= map.get(list.get(idx));
				idx++;
			}else {
				ans += n * list.get(idx);
				break;
			}
		}
		System.out.println(ans);
		in.close();

	}

}
