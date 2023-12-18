import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];
		while(sc.hasNextLine()){
			String input = sc.nextLine().toLowerCase();
			int tail = 0;
			for (int c : input.toCharArray()) { 
				if (c >= 'a' && c <= 'z') count[c-'a']++;		
				tail = c;
			}
			if (tail >= 'a' && tail <= 'z') continue;
			else break;
		}
		for (int i = 0; i < 26; i++) 
			System.out.printf("%c : %d\n", 'a'+i, count[i]);			
	}
}