import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] isRights = new boolean[n];
		for (int i = 0; i < n; i++) {
		    isRights[i] = (sc.nextInt() == 0);
		}
		PriorityQueue<Integer> rights = new PriorityQueue<>();
		PriorityQueue<Integer> lefts = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
		    if (isRights[i]) {
		        rights.add(sc.nextInt());
		    } else {
		        lefts.add(sc.nextInt());
		    }
		}
		if (rights.size() == 0 || lefts.size() == 0) {
		    System.out.println(0);
		} else {
		    System.out.println(rights.peek() + lefts.peek());
		}
	}
}

