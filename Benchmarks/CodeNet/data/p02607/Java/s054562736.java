import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if ((i + 1) % 2 != 0 && list.get(i) % 2 != 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
