
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Character> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(scan.next().charAt(0));
		}
		
		if (list.contains('Y')) {
			System.out.println("Four");
		} else {
			System.out.println("Three");
		}
	}
}
