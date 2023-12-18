import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int c = 0;
		boolean notHave = false;
		ArrayList<ArrayList<Integer>> b_list = new ArrayList<ArrayList<Integer>>(n);
		int count_treat = 0;

		for(int i = 0;i < n;i++) {
			b_list.add(new ArrayList<Integer>());
		}

		for(int i = 0;i < (2 * k);i++) {
			if(i % 2 == 0) {
				c = scan.nextInt();
			}else {
				for(int j = 0;j < c;j++) {
					b_list.get(scan.nextInt() - 1).add(i);
				}
			}
		}

		for(int i = 0;i < n;i++) {
			if(b_list.get(i).size() == 0) {
				count_treat += 1;
			}
		}

		System.out.println(count_treat);
	}
}
