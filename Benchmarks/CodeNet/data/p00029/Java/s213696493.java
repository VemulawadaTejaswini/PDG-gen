import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = sc.nextLine();
		String[] strs = s.split(" ");
		Map<String,Integer> map = new HashMap<>();
		int length_max = Integer.MIN_VALUE;
		int length_max_i = 0;
		int count_max = Integer.MIN_VALUE;
		for (int i=0; i<strs.length; i++) {
			map.put(strs[i],map.getOrDefault(strs[i],0));
			map.put(strs[i],map.get(strs[i])+1);
			if (length_max < strs[i].length()) {length_max_i = i;}
			length_max = Math.max(length_max,strs[i].length());
			count_max = Math.max(count_max,map.get(strs[i]));
		}
		
		for (Map.Entry<String,Integer> entry : map.entrySet()) {
			int a = entry.getValue();
			if (a==count_max) {System.out.print(entry.getKey());}
		}
		System.out.println(" "+strs[length_max_i]);
	}
}
