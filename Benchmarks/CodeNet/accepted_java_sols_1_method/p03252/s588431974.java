import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		sc.close();
		
		boolean flag = true;
		Map<Character, Character> map = new HashMap<>();
		Map<Character, Integer> sMap = new HashMap<>();
		Map<Character, Integer> tMap = new HashMap<>();
		for(int i = 0;i < S.length();++i) {
			if(map.containsKey(S.charAt(i))) {
				if(map.get(S.charAt(i)) != T.charAt(i)) {
					flag = false;
					break;
				}
			} else {
				map.put(S.charAt(i), T.charAt(i));
			}
			if(sMap.containsKey(S.charAt(i)))
				sMap.put(S.charAt(i), sMap.get(S.charAt(i)) + 1);
			else
				sMap.put(S.charAt(i), 1);
			if(tMap.containsKey(T.charAt(i)))
				tMap.put(T.charAt(i), tMap.get(T.charAt(i)) + 1);
			else
				tMap.put(T.charAt(i), 1);
		}
		if(flag) {
			if(sMap.size() != tMap.size()) {
				flag = false;
			} else {
				int size = sMap.size();
				int[] sQty = new int[size];
				int[] tQty = new int[size];
				Character[] sKeyset = new Character[size];
				sMap.keySet().toArray(sKeyset);
				Character[] tKeyset = new Character[size];
				tMap.keySet().toArray(tKeyset);
				for(int i = 0;i < size;++i) {
					sQty[i] = sMap.get(sKeyset[i]);
					tQty[i] = tMap.get(tKeyset[i]);
				}
				Arrays.sort(sQty);
				Arrays.sort(tQty);
				if(!Arrays.equals(sQty, tQty)) {
					flag = false;
				}
			}
		}
		
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
