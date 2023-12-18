import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	class Mark {
		int id;
		int correct;
		int time;
		int[] wrong;
		Mark(int id, int p) {
			this.id = id;
			correct = 0;
			time = 0;
			wrong = new int[p];
		}
	}
	
	void sort(Mark[] a) {
		int n = a.length;
		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j].correct < a[j+1].correct ||
						(a[j].correct == a[j+1].correct && a[j].time > a[j+1].time)) {
					Mark temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	void run() {
		int t, p, r;
		while (true) {
			t = sc.nextInt(); p = sc.nextInt(); r = sc.nextInt();
			if (t == 0) return;
			
			Mark[] result = new Mark[t];
			for (int i = 0; i < t; i++)
				result[i] = new Mark(i+1, p);
			
			for (int i = 0; i < r; i++) {
				int tid = sc.nextInt()-1, pid = sc.nextInt(), time = sc.nextInt();
				if (sc.next().equals("CORRECT")) {
					result[tid].correct++;
					result[tid].time += time + result[tid].wrong[pid-1]*1200;
				} else {
					result[tid].wrong[pid-1]++;
				}
			}
			
			sort(result);
			
			for (int i = 0; i < t; i++)
				out.printf("%d %d %d\n", result[i].id, result[i].correct, result[i].time);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}