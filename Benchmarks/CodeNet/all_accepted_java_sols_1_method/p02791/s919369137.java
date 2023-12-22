import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}

		int count = 0;
		int min = Collections.max(list);

		for(int i = 0; i < n; i++) {
			if(list.get(i) <= min) {
				min = list.get(i);
				count++;
			}
		}

		System.out.println(count);

	}
}