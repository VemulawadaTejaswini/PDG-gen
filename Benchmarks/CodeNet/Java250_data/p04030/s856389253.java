
import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < c.length; i++) {
			switch (c[i]) {
			case '0':
				list.add(0);
				break;
			case '1':
				list.add(1);
				break;
			case 'B':
				if (list.size() == 0) {
					break;
				}
				list.remove(list.size() - 1);
			}
		}
		
		for (Integer integer : list) {
			System.out.print(integer);
		}
	}
}