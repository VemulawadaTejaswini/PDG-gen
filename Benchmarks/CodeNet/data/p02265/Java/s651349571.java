
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		for (int i=0; i<size; i++) {
			String[] tmp = sc.nextLine().split(" ");
			if ("insert".equals(tmp[0]))
				ll.add(0, Integer.parseInt(tmp[1]));
			else if ("deleteFirst".equals(tmp[0]))
				ll.removeFirst();
			else if ("deleteLast".equals(tmp[0]))
				ll.removeLast();
			else {
				int pos = ll.indexOf(Integer.parseInt(tmp[1]));
				if (pos>=0) ll.remove(pos);
			}
		}
		int i=0, llsize=ll.size();
		while (i<llsize) {
			if (i==llsize-1) System.out.println(ll.get(i));
			else System.out.print(ll.get(i) + " ");
			i ++;
		}
	}

}

