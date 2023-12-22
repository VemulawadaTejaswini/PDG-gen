import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner ;

public class Main {
	public static void main(String[] ragas) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;

		for(int i = 0;i < n;i++) {
			list.add(scan.nextInt());
		}

		Collections.sort(list);

		for(int i = 0;i < k;i++) {
			count += list.get(i);
		}

		System.out.println(count);
	}
}
