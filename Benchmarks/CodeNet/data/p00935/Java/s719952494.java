import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[] = new int[n];
		for (int i = 0; i < d.length; i++) {
			d[i] = sc.nextInt();
		}
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < d.length; i++) {
			int val = d[i];
			set.add(val);
			for (int j = i + 1; j < Math.min(d.length, i + 10); j++) {
				val *= 10;
				val += d[j];
				set.add(val);
			}
		}
		for (int i = 0; i < 1000; i++) {
			if (!set.contains(i)) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}