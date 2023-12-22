import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.parseInt(line);

		int[] va = new int[v];
		List<Integer> klist = new ArrayList<Integer>();

		String line2 = sc.nextLine();
		String[] k = line2.split(" ");
		for (int j = 0; j < k.length; j++) {
			va[j] = Integer.parseInt(k[j]);
			klist.add(va[j]);
		}

		java.util.Collections.reverse(klist);
		int val = 0;
		for (Integer integer : klist) {
			System.out.print(integer);
			if (val != v - 1) {
				System.out.print(" ");
			}
			val++;
		}
		System.out.println("");
	}
}