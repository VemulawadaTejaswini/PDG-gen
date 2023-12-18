import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<List<Integer>, Integer> map = new HashMap<>();
		for(int i=1; i<=n; i++){
			String str= Integer.toString(i);
			char head = str.charAt(0);
			char tail = str.charAt(str.length()-1);
			List<Integer> list = new ArrayList<>();
			list.add(Integer.parseInt(String.valueOf(tail)));
			list.add(Integer.parseInt(String.valueOf(head)));
			if(!map.containsKey(list) && tail != '0'){		
				map.put(list, 0);
			}
		}
		for (List<Integer> key : map.keySet()) {
			int f = key.get(0);
			int l = key.get(1);
			for(int i=1; i<=n; i++) {
				String str= Integer.toString(i);
				char head = str.charAt(0);
				char tail = str.charAt(str.length()-1);
				if(f == Integer.parseInt(String.valueOf(head))
				   && l == Integer.parseInt(String.valueOf(tail))){
					map.put(key, map.get(key)+1);
				}
			}
		}
		int result = 0;
		for(int i=1; i<=n; i++) {
			String str= Integer.toString(i);
			char head = str.charAt(0);
			char tail = str.charAt(str.length()-1);
			List<Integer> list = new ArrayList<>();
			list.add(Integer.parseInt(String.valueOf(tail)));
			list.add(Integer.parseInt(String.valueOf(head)));
			if(tail != '0'){
				result += map.get(list);
			}
		}
		System.out.println(result);
	}
}
