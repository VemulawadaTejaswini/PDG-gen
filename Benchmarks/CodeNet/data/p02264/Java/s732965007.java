import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

// ALDS1_3_B
public class Main {
	public static void calc(Queue<Info> qu, int q) {
		Info info;
		int time = 0;
		while (!qu.isEmpty()) {
			info = qu.remove();
			if (info.time - q > 0) {
				info.time = info.time - q;
				qu.add(info);
				time += q;
			} else {
				time += info.time;
				System.out.println(info.name + " " + time);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Info> qu = new LinkedList<Info>();
		int n = sc.nextInt();
		int q = sc.nextInt();
		for (int i = 0; i < n; i++) {
			qu.add(new Info(sc.next(), sc.nextInt()));
		}
		calc(qu, q);
		sc.close();
	}
}

class Info {
	String name;
	int time;
	Info(String name, int time) {
		this.name = name;
		this.time = time;
	}
	Info() {}
}
