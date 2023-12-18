import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		

		List<Integer> list = new ArrayList<Integer>();
		for (;;) {
			int num = scan.nextInt();
			if (num == 0) {
				break;
			}
			list.add(num);
		}

		int i = 1;
		for (Integer num : list) {
			System.out.printf("Case %d: %d\n", i++, num);
		}
		scan.close();

	}

}