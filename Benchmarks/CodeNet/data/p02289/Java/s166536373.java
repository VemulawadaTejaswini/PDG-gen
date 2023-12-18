import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		String com = scan.next();
		while(!com.equals("end")) {
			if(com.equals("insert")) {
				queue.add(scan.nextInt());
			}else if(com.equals("extract")) {
				System.out.println(queue.poll());
			}
			com = scan.next();
		}
		scan.close();
	}
}
