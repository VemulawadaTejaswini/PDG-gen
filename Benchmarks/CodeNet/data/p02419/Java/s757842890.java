import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			String word = sc.next(); // 全て小文字へ
			int count = 0;
			for(String line = sc.next(); !line.equals("END_OF_TEXT"); line = sc.next()) {
				String[] tokens = line.split(" ");
				for(String t: tokens) {
					if(t.equalsIgnoreCase(word)) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}

