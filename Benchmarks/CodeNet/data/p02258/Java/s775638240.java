import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static int[] memo = new int[45];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> diff = new ArrayList<Integer>();
		
		int n = in.nextInt();
		int min = in.nextInt();
		for (int i = 1; i < n; i++) {
			int val = in.nextInt();
			diff.add(val-min);
			if (min > val) min=val;
		}
		Collections.sort(diff, Comparator.reverseOrder());
		System.out.println(diff.get(0));
	}
}

