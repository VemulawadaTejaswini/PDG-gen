import java.sql.Array;
import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String S = sc.next();
			if(!map.containsKey(S)){
				map.put(S, 1);
			}else{
				map.put(S,map.get(S)+1);
			}
		}
		int cnt = 0;
		for (String key : map.keySet()) {
			if (cnt<map.get(key)) {
				cnt = map.get(key);
			}
		}
		ArrayList<String> list = new ArrayList<>();
		for (String key : map.keySet()) {
			if (cnt==map.get(key)) {
				list.add(key);
			}
		}
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
		sc.close();
    }	
		
}