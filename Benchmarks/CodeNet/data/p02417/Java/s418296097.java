import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = "";
		int[] b = new int[26];
		while(scanner.hasNext()) {
			str = scanner.nextLine();
			str = str.toLowerCase();
			char[] c = str.toCharArray();
			for(int i = 0; i < c.length; i++) {
				if('a' <= c[i] && c[i] <= 'z') {
					b[c[i] - 'a']++;
				}
			}
		}
		for(int i = 0; i < 26; i++) {
			System.out.println(((char)(i + 'a')) + " : " + b[i]);
		}
	}
}
