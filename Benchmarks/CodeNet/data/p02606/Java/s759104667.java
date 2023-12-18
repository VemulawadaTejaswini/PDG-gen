import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		int R = scan.nextInt();
		int d = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = L; i < R + 1; i++) {
			list.add(i);
		}
		int count = 0;
		for (int i : list) {
			if (i % d == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
