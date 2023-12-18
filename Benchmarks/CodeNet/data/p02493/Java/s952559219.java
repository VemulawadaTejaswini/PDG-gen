
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>();

		while (sc.hasNext()) {
			int times = sc.nextInt();
			if (times == 0L) {
				break;
			}
			LinkedList<Integer> list2 = new LinkedList<Integer>();
			for (int i = times; i > 0; i--) {
				list2.add(sc.nextInt());
			}
			list.add(list2);
		}
		for (LinkedList<Integer> list2 : list) {
			StringBuilder sb = new StringBuilder();
			Collections.sort(list2);
			boolean flag = true;
			for (ListIterator<Integer> it = list2.listIterator(list2.size()); it.hasPrevious();) {
				if(flag){
					sb.append(it.previous());
					flag = false;
				}else {
					sb.append(" ").append(it.previous());
				}
				
			}
			System.out.println(sb.toString());
		}
	}
}