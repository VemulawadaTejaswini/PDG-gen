import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int n = sc.nextInt();
		for( int i=0; i<n; i++) {
		    String str = sc.next();
		    Integer count = map.get(str);
		    if (count == null) {
		        map.put(str,1);
		    } else {
                map.remove(str);
		        map.put(str,count+1);
		    }
		}
		List list = new ArrayList();
		int max_count = 0;
		for (String key : map.keySet()) {
		    int c = map.get(key);
		    if (max_count <= c) max_count = c;
		}
		for (String key : map.keySet()) {
		    int c = map.get(key);
		    if (max_count == c) list.add(key);
		}
		Collections.sort(list);
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}
	}
}
