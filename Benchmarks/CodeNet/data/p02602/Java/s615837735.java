import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> pointlist = new LinkedList<Integer>();

		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			pointlist.add(a);
		}


		for (int a = 0; a < pointlist.size() - k; a++) {
			if (pointlist.get(a)<pointlist.get(a+k)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}