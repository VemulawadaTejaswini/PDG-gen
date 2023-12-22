import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] alphabet = new int[26];
		
		while (sc.hasNext()) {
			String s = sc.nextLine();
			for (int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				if ('a'<=c && c<='z') {
					alphabet[c-97]++;
				}
				else if ('A'<=c && c<='Z') {
					alphabet[c-65]++;
				}
			}
		}
		for (int i=0; i<26; i++) {
			System.out.println((char)(i+97)+" : "+alphabet[i]);
		}
	}
}

