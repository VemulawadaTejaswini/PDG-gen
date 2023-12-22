
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = -1000000000;
		int N = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}
		int min = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			max = Math.max(max, list.get(i) - min);
			min = Math.min(min, list.get(i));
		}
		System.out.println(max);
	}

}

