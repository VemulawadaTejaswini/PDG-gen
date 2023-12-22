import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			for(String line = sc.next(); !line.equals("-"); line = sc.next()) {
				int m = sc.nextInt();
				for(int i = 0; i < m; i++) {
					int h = sc.nextInt();
					line = line.substring(h) + line.substring(0, h);
				}
				System.out.println(line);
			}
		}
	}
}

