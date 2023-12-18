import java.util.*;
import static java.lang.System.*;

public class Main {

	class P {
		int x, y;
		P(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	Scanner sc = new Scanner(in);
	
	void run() {
		int n;
		P[] c = new P[200];
		c[0] = new P(0, 0);
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			if (n == 1) {
				out.println("1 1");
			} else {
				int xmax, xmin, ymax, ymin;
				xmax = xmin = ymax = ymin = 0;
				for (int i = 1; i < n; i++) {
					int x = sc.nextInt(), y = sc.nextInt();
					switch(y) {
					case 0:
						c[i] = new P(c[x].x-1, c[x].y);
						xmin = Math.min(xmin, c[x].x-1);
						break;
					case 1:
						c[i] = new P(c[x].x, c[x].y-1); 
						ymin = Math.min(ymin, c[x].y-1);
						break;
					case 2:
						c[i] = new P(c[x].x+1, c[x].y); 
						xmax = Math.max(xmax, c[x].x+1);
						break;
					case 3:
						c[i] = new P(c[x].x, c[x].y+1); 
						ymax = Math.max(ymax, c[x].y+1);
						break;
					}
				}
				out.printf("%d %d\n", xmax-xmin+1, ymax-ymin+1);
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}