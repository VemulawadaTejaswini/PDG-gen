import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			int n = sc.nextInt();
			List<Long> list = new ArrayList<Long>();
			for (int i=0; i<n; i++) list.add(sc.nextLong());
			int times = sc.nextInt();
			for (int i=0; i<times; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				List<Long> sublist = list.subList(start, end);  //参照型にして、変更が反映できるように
				Collections.reverse(sublist);
			}
			for (int i=0; i<n-1; i++) System.out.print(list.get(i) + " ");
			System.out.println(list.get(n-1));
		}
	}
}
