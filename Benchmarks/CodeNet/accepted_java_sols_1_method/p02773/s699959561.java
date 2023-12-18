import java.util.*;
class Main{
	public static void main(String ags[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int[] count = new int[n];
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++){
			s[i] = sc.next();
			if (map.containsKey(s[i])){
				int value = map.get(s[i]);
				value++;
				map.put(s[i],value);
			} else {
				map.put(s[i], 1);
			}
		}
		int maxvalue = Collections.max(map.values()); 
		List<String> list = new ArrayList<>();
		for (Map.Entry<String, Integer> m : map.entrySet()){
			if (m.getValue() == maxvalue){
				list.add(m.getKey());
				//~ map.remove(s[i]);
			}
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}
