import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] s = new String[n];

		int i;
		TreeMap<String, Integer> map = new TreeMap<>();
		for(i = 0; i < n; i++) {
			s[i] = scan.next();
			if(map.containsKey(s[i]))
				map.put(s[i], map.get(s[i]) + 1);
			else
				map.put(s[i], 1);
		}
		int max = Integer.MIN_VALUE;
		for(int a: map.values()) {
			if(max < a)
				max = a;
		}
		for(Entry<String, Integer> temp : map.entrySet()) {
			if(temp.getValue() == max)
				System.out.println(temp.getKey());
		}
	}
}