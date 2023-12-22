import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] rags) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(n);

		for(int i = 0;i < n;i++) {
			list.add(new ArrayList<Integer>());
		}

		for(int i =0;i < n - 1;i++) {
			list.get(scan.nextInt() - 1).add(1);
		}

		for(int i = 0;i < n;i++) {
			System.out.println(list.get(i).size());
		}
	}
}
