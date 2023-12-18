import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeMap<String, Integer> map = new TreeMap<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    int type = sc.nextInt();
		    String key = sc.next();
		    if (type == 0) {
		        int value = sc.nextInt();
		        map.put(key, value);
		    } else if (type == 1) {
		        if (map.containsKey(key)) {
		            sb.append(map.get(key));
		        } else {
		            sb.append(0);
		        }
		        sb.append("\n");
		    } else if(type == 2) {
		        map.remove(key);
		    } else {
		        String end = sc.next();
		        key = map.lowerKey(key);
		        if (key == null) {
		            key = "";
		        }
		        while ((key = map.higherKey(key)) != null && key.compareTo(end) <= 0) {
		            sb.append(key).append(" ").append(map.get(key)).append("\n");
		        }
		    }
		}
		System.out.print(sb);
	}
}

