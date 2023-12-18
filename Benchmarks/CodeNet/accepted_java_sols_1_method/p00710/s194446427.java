import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			
			if (n == 0 && r == 0) {
				break;
			}
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				list.add(i+1);
			}
			for (int i = 0; i < r; i++) {
				int p = sc.nextInt();
				int c = sc.nextInt();
				for (int j = 0; j < c; j++) {
					int pop = list.remove(n+1-p-c);
					list.add(pop);
				}
			}
			System.out.println(list.get(list.size() - 1));
		}
	}
}