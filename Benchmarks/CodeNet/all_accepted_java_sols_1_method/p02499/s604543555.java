import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] alphabet = new int[26];
		
		String s;
		while (sc.hasNext()) {
			s = sc.next();
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if ('A' <= c && c <= 'Z') {
					alphabet[c - 'A']++;
				}
				if ('a' <= c && c <= 'z') {
					alphabet[c - 'a']++;
				}
			}
		}
		
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + " : " + alphabet[c - 'a']);
		}
		
		sc.close();
	}
}