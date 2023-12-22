import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = Integer.parseInt(sc.next());
		sc.close();

		ArrayList<Integer> list = new ArrayList<>();
		Set<Integer> checkSet = new HashSet<>();
		list.add(s);
		checkSet.add(s);
		int i = 0;
		while(list.size() == checkSet.size()) {
			int a = list.get(i);
			if(a % 2 == 0) {
				int tmp = a / 2;
				list.add(tmp);
				checkSet.add(tmp);
			}else {
				int tmp = 3 * a + 1;
				list.add(tmp);
				checkSet.add(tmp);
			}
			i++;
		}
		System.out.println(i + 1);
	}

}