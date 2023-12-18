import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(
	  16, 0.75f, true);
	while (in.hasNext()) {
	 String str = in.next();
	 if (map.containsKey(str)) {
		map.put(str, map.get(str) + 1);
	 } else {
		map.put(str, 1);
	 }
	}
	String longest = "";
	String maxA = "";
	Integer maxCount = Integer.valueOf(0);
	for (Map.Entry<String, Integer> entry : map.entrySet()) {
	 String key = entry.getKey();
	 if (key.length() > longest.length()) {
		longest = key;
	 }
	 if (entry.getValue().compareTo(maxCount) > 0) {
		maxA = key;
	 }
	}
	String result = new StringBuilder()
	  .append(maxA)
	  .append(' ')
	  .append(longest)
	  .toString();
	System.out.println(result);
 }

}