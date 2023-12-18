import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		ArrayList<Integer> list_c = new ArrayList<Integer>(n);

		for(int i = 0;i < n;i++) {
			list.add(scan.nextInt());
			list_c.add(list.get(i));
		}

		Collections.sort(list_c);

		for(int i = 0;i < n;i++) {
			if(list_c.get(n - 1) == list.get(i)) {
				System.out.println(list_c.get(n - 2));
			}else {
				System.out.println(list_c.get(n - 1));
			}
		}
	}
}