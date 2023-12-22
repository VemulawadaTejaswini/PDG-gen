import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int min = 114514;
		for(char c = 'a'; c <= 'z'; c++) {
			String ns = s;
			int count=0;
			while(!ns.matches("("+c+")*")) {
				count++;
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < ns.length()-1; i++) {
					if(ns.charAt(i)==c||ns.charAt(i+1)==c) {
						sb.append(c);
					} else {
						sb.append('P');
					}
				}
				ns = sb.toString();
			}
			min = Math.min(min, count);
		}
		System.out.println(min);
	}
}