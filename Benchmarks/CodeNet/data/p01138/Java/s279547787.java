import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	class T implements Comparable<T>{
		int start, arrive;
		T(int s, int a) {
			this.start = s;
			this.arrive = a;
		}
		@Override
		public int compareTo(T obj) {
			if (this.start < obj.start) return -1;
			else if (this.start > obj.start) return 1;
			return 0;
		}
	}
	
	
	void run() {
		int n;
		StringTokenizer st;
		while (true) {
			n = Integer.parseInt(sc.nextLine());
			if (n == 0) break;
			T[] time = new T[n];
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(sc.nextLine(), ": ");
				time[i] = new T(Integer.parseInt(st.nextToken())*60*60+Integer.parseInt(st.nextToken())*60+Integer.parseInt(st.nextToken()),
								Integer.parseInt(st.nextToken())*60*60+Integer.parseInt(st.nextToken())*60+Integer.parseInt(st.nextToken()));	
//				out.printf("%d %d\n", time[i].start, time[i].arrive);
			}
			Arrays.sort(time);
			int count = 0;
			boolean[] check = new boolean[n];
			for (int i = 0; i < n; i++) {
				if (!check[i]) {
					count++;
					int pre = i, next = i+1;
					while (next < n) {
						if (!check[next] && time[pre].arrive <= time[next].start) {
							check[next] = true;
							pre = next;
							next++;
						} else {
							next++;
						}
					}
				}
			}
			out.println(count);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}