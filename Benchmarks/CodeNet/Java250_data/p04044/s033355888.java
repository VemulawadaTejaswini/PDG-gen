import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l = scan.nextInt();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			list.add(scan.next());
		}
		Collections.sort(list);
		for (String s : list) {
			System.out.print(s);
		}
		System.out.println();
	}
}