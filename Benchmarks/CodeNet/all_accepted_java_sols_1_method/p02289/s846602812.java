import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		while (true) {
		    String type = sc.next();
		    if (type.equals("end")) {
		        break;
		    } else if (type.equals("insert")) {
		        queue.add(-sc.nextInt());
		    } else {
		        sb.append(-queue.poll()).append("\n");
		    }
		}
		System.out.print(sb);
	}
}

