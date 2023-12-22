import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for(int i=0; i<N;i++) {
			String s = sc.next();
			if(map.get(s)==null) {
				map.put(s, 1);
			}else {
				map.put(s, map.get(s)+1);
			}
		}
		Object[] values = map.values().toArray();
		int max=0;
		for(Object v :values) {
			max= Integer.max(max, (int) v);
		}
		for (Map.Entry<String,Integer> entry : map.entrySet()) {
			if(entry.getValue()==max) {
				System.out.println(entry.getKey());
			}
		}
		
	}



}
