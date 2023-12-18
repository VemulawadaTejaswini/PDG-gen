import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < x; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d", list.get(i));
			if (i != list.size() - 1) {
				System.out.printf(" ");
			}
		}
		System.out.printf("\n");
	}
}