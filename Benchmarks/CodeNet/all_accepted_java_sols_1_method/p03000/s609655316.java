
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		final int N = scan.nextInt();
		final int X = scan.nextInt();
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}
		
		int index = 0;
		int count = 1;
		for (Integer i : list) {
			index += i;
			if (index <= X) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}