import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int time = scanner.nextInt();
		int total=0;
		Deque<Integer> queue = new ArrayDeque<Integer>();
		Deque<String> name = new ArrayDeque<String>();
		for (int i = 0; i < n; i++) {
			name.add(scanner.next());
			queue.add(scanner.nextInt());
		}
		while(true) {
			int num=queue.poll();
			String name1=name.poll();
			num=num-time;
			if(num<=0) {
				total=total+time+num;
				System.out.print(name1+" ");
				System.out.println(total);
				if(name.isEmpty()) {
					break;
				}
			}else {
				total=total+time;
				queue.add(num);
				name.add(name1);
			}
		}
		scanner.close();
	}

}

