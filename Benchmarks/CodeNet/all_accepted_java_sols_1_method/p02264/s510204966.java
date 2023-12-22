import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int timecount =0;
		int count = sc.nextInt();
		int max   = sc.nextInt();

		Queue<String> queName = new LinkedList<String>();
		Queue<Integer> queTime = new LinkedList<Integer>();

		for(int i=0; i<count; i++) {
			queName.add(sc.next());
			queTime.add(sc.nextInt());
		}

		while(queName.size() !=0) {
			if(queTime.peek()-max>0) {
				queName.add(queName.poll());
				queTime.add(queTime.poll()-max);
				timecount +=max;
			}else {
				timecount += queTime.poll();
				System.out.println(queName.poll()+" "+timecount);
			}

		}




	}
}


