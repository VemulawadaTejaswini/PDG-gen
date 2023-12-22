import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		int[] cnt = new int[26];
		
		while(sc.hasNext()) {
			str = sc.nextLine().toLowerCase();
			
			char[] charStr = str.toCharArray();
			
			for(int i = 0; i < str.length(); i++) {
				if('a' <= charStr[i] && charStr[i] <= 'z') {
					cnt[charStr[i] - 'a']++;
				}
			}
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.println(((char)(i + 'a')) + " : " + cnt[i]);
		}
	}
}