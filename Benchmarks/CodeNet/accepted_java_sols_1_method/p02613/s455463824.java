import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<String> list = new ArrayList<String>();
		for(int i=0; i<n; i++){
			String str = sc.next();
			list.add(str);
		}
		Map<String, Integer> map = new HashMap<>();
		map.put("AC",0);
		map.put("WA",0);
		map.put("TLE",0);
		map.put("RE",0);
		for (String key : list) {
    		Integer i = map.get(key);
    		map.put(key, i + 1);
		}
		System.out.println("AC x "+map.get("AC"));
		System.out.println("WA x "+map.get("WA"));
		System.out.println("TLE x "+map.get("TLE"));
		System.out.println("RE x "+map.get("RE"));
	}
}
