
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(list.size() - 1) - list.get(0));
	}
}