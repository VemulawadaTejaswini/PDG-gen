import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			PriorityQueue<Integer> Q=new PriorityQueue<Integer>(Collections.reverseOrder());
			
			while(sc.hasNext()) {
				String str=sc.next();
				if(str.equals("end")) {
					break;
				}
				if(str.equals("insert")) {
					int value=sc.nextInt();
					Q.add(value);
				}
				else {
					System.out.println(Q.poll());
				}
			}
			

		}
	}
}

