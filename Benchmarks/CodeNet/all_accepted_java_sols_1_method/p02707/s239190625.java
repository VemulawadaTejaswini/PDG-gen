import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.next());
		List<Integer> empList = new ArrayList<>();
		empList.add(0);
		for (int i = 1; i < num; i++) {
			empList.add(0);
			int bossNum = Integer.parseInt(sc.next());
			empList.set(bossNum - 1, empList.get(bossNum - 1) + 1);

		}
		for (int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i));
		}
	}

}
