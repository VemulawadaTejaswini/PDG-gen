import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	static int n;
	static int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		boolean[] array = new boolean[n + 1];
		int max = 0;
		int k = sc.nextInt();
		Set<Integer> b = new TreeSet<>();
		for (int i = 0; i < k; i++) {
			b.add(sc.nextInt());
		}
		if (k <= 0) {
			System.out.println("0:");
		}
		while (max < n) {
			array[max] = true;
			String str = ++count + ": ";
			int index = 0;
			int count = 0;
			Set<Integer> tmpList = new TreeSet<>();
			for (int i = 0; i < max; i++) {
				if (array[i]) {
					str += i + " ";
					++count;
					tmpList.add(i);
				}
			}
			str += max;
			tmpList.add(max);
			
			for (int i = 0; i < max; i++) {
				if (!array[i]) {
					array[i] = true;
					index = i;
					break;
				}
			}
			for (int j = 0; j < n - 2; j++) {
				for (int i = 0; i < index; i++) {
					if (array[i]) {
						array[i] = false;
						break;
					}
				}
			}
			
			if (tmpList.containsAll(b)) {
				System.out.println(str);
			}
			
			if (count >= max) {
				++max;
				array = new boolean[n + 1];
			}
		}
	}
}

