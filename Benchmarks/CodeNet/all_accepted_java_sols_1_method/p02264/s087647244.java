import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		Queue<String> qProcess = new LinkedList<String>();
		Queue<Integer> qTime = new LinkedList<Integer>();
		
		int totalTime = 0;
		
		for (int i = 0; i < n; i++) {
			qProcess.add(sc.next());
			qTime.add(sc.nextInt());
		}
		
		while (qProcess.size()>0) {
			if (qTime.peek() - q > 0) {
				qProcess.add(qProcess.poll());
				qTime.add(qTime.poll()-q);
				totalTime = totalTime + q;
			} else {
				totalTime = totalTime + qTime.poll();
				System.out.println(qProcess.poll() + ' ' + totalTime);
			}
		}
	}
}
