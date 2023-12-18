import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	int time = 0;
	void run() {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> Qi = new ArrayDeque<>();
		Deque<String> Qs = new ArrayDeque<>();
		int n = sc.nextInt();
		int q = sc.nextInt();
		for(int i = 0; i < n; i++) {
			Qs.addLast(sc.next());
			Qi.addLast(sc.nextInt());
		}
		while(!Qs.isEmpty()) {
			int a = Qi.poll();
			String s = Qs.poll();
			if(a <= q) {
				time += a;
				System.out.println(s + " " + time);
			}else {
				time += q;
				Qs.addLast(s);
				Qi.addLast(a - q);
			}
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
