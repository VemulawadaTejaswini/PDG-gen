import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Set<Integer> as = new HashSet<>();
		int over3200 = 0;
		for (int i = 0; i < N; i++) {
			int a = in.nextInt();
			if (a < 400) {
				as.add(1);
			} else if (a < 800) {
				as.add(2);
			} else if (a < 1200) {
				as.add(3);
			} else if (a < 1600) {
				as.add(4);
			} else if (a < 2000) {
				as.add(5);
			} else if (a < 2400) {
				as.add(6);
			} else if (a < 2800) {
				as.add(7);
			} else if (a < 3200) {
				as.add(8);
			} else {
				over3200++;
			}
		}
		if (over3200 == 0) {
			System.out.println(as.size() + " ");
		} else {
			System.out.print(Math.max(1, as.size()) + " ");
		}
		System.out.println(as.size() + over3200);
		in.close();
	}
}