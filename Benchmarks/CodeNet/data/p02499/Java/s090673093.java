import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];
		while(sc.hasNextLine()){
			String input = sc.nextLine().toLowerCase();
			for (int c : input.toCharArray()) 
				if (c >= 'a' && c <= 'z') count[c-'a']++;		
			if (input.charAt(input.length() - 1) == '.') break;
		}
		for (int i = 0; i < 26; i++) 
			System.out.printf("%c : %d\n", 'a'+i, count[i]);			
	}
}