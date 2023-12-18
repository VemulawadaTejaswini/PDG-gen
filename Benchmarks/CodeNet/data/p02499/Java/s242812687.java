import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];
		while(sc.hasNext()){
			String input = sc.nextLine().toLowerCase();
			for (int c : input.toCharArray()) { 
				if (c >= 'a' && c <= 'z') count[c-'a']++;
			}
		}
		for (int i = 0; i < 26; i++) 
			System.out.printf("%c : %d\n", 'a'+i, count[i]);			
	}
}