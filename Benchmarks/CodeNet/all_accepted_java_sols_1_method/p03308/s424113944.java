import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> nList = new ArrayList<>();

		for (int index = 1; index <= n; index++) {
			int m = sc.nextInt();
			nList.add(m);
		}
		Collections.sort(nList);
		int x = nList.get(0);
		int y = nList.get(nList.size() - 1);
		int z = y - x;
		System.out.println(z);
	}
}