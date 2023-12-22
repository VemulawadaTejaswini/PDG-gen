import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		Map<String,Integer> map = new HashMap<String, Integer>();
		List<Integer> values = new ArrayList<Integer>();
		List<String> ans = new ArrayList<String>();
		
		for(int i = 0 ; i < n ; i++) {
			String s = sc.next();

			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s,1);
			}

		}

		
		map.entrySet().stream()
		.sorted(java.util.Map.Entry.comparingByKey())
		.sorted(java.util.Collections.reverseOrder(java.util.Map.Entry.comparingByValue()))
		.forEach(s -> {
			values.add(s.getValue());
			ans.add(s.getKey());
			
			
		});

		
		int cnt = values.get(0);
		for(int i = 0 ; i < values.size() ; i++) {
			if(cnt == values.get(i)) {
				System.out.println(ans.get(i));
				
			}else {
				break;
			}
			
			
		}
		
	}



}