import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int read = in.nextInt();
		final int max = read;
		Set<Integer> useCheck = new CopyOnWriteArraySet<Integer>();
		int a = 1;
		int count = 0;
		for (int i = 2; i <= max; i++) {
			boolean isSosu = true;
			for (int check : useCheck) {
				if (i % check == 0) {
					isSosu = false;
					break;
				}
			}
			if (isSosu) {
				if (a < max) {
					a *= i;
					useCheck.add(i);
				}
				count++;
			}
		}
		System.out.println(count);
	}
}