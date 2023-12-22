import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(), M = sc.nextLong();
		Map<Long,ArrayList<String>> map = new HashMap<>();
		if(M == 0) System.out.println(0 +" " + 0);
		else {
			for(int i = 0; i < M; i ++) {
				long c = sc.nextLong();
				String str = sc.next();
				if(map.containsKey(c)) {
					map.get(c).add(str);
				}else {
					map.put(c, new ArrayList<String>(Arrays.asList(str)));
				}
			}
			long ac = 0, wa = 0;
			for(long l : map.keySet()) {
				ArrayList<String> ar = map.get(l);
				if(ar.contains("AC")) {
					long a = ar.indexOf("AC");
					wa += a;
					ac++;
				}
			}
			System.out.println(ac +" " + wa);
		}
	}
}