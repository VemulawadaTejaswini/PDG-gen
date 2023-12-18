import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> Q = new ArrayDeque<>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			int a;
			switch(s) {
			case "insert" :
				a = sc.nextInt();
				Q.addLast(a);
				break;
			case "delete" :
				a = sc.nextInt();
				Q.remove(a);
				break;
			case "deleteFirst" :
				Q.removeFirst();
				break;
			case "deleteLast" :
				Q.removeLast();
				break;
			}
		}
		if(!Q.isEmpty()) {
			System.out.print(Q.poll());
		}
		while(!Q.isEmpty()) {
			System.out.print(" " + Q.poll());
		}
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
