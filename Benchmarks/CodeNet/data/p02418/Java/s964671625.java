import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			String line = sc.next();
			String word = sc.next();
			System.out.println((line + line).indexOf(word) >= 0 ? "Yes" : "No");
		}
	}
}

