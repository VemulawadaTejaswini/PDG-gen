import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		while (n-- > 0) {
			list.add(in.nextInt());
		}
		for (int i = 0; i < q; i++) {
			int _0 = in.nextInt();
			int _1 = in.nextInt();
			int _2 = in.nextInt();
			switch (_0) {
			case 0: {
				Integer val = list.remove(_2);
				list.add(_1, val);
				break;
			}
			case 1:
				List<Integer> sublist = list.subList(_1, _2 + 1);
				Integer min = Integer.valueOf(10000000);
				for (Integer val : sublist) {
					if (val.compareTo(min) < 0) {
						min = val;
					}
				}
				System.out.println(min);
				break;
			default:
				list.set(_1, Integer.valueOf(_2));
				break;
			}
		}

	}
}