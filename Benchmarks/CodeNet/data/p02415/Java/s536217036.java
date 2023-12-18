import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	static  char exchange(char c) {
		if(Character.isUpperCase(c)) {
			return Character.toLowerCase(c);
		}
		if(Character.isLowerCase(c)) {
			return Character.toUpperCase(c);
		}
		return c;
	}
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			String line = sc.nextLine();
			// 文字列を連結しながら生成するときは StringBuilderをつくる
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < line.length(); i++) {
				sb.append(exchange(line.charAt(i)));
			}
			line = sb.toString();  // 連結した文字列をえる
			System.out.println(line);
		}
	}
}

