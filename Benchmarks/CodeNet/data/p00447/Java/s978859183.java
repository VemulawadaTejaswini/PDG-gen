import java.awt.Point;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int m = sc.nextInt();
			
			if(m == 0){
				break;
			}
			
			Point[] points = new Point[m];
			for (int i = 0; i < m; i++) {
				points[i] = new Point(sc.nextInt(), sc.nextInt());
			}
			
			int d_x = points[0].x;
			int d_y = points[0].y;
			for (int i = 0; i < m; i++) {
				points[i].x = points[i].x - d_x;
				points[i].y = points[i].y - d_y;
			}

			final int n = sc.nextInt();

			Point[] global = new Point[n];
			for (int i = 0; i < n; i++) {
				global[i] = new Point(sc.nextInt(), sc.nextInt());
			}

			for (int i = 0; i < n; i++) {
				//System.out.println(i);
				
				int dx = global[i].x;
				int dy = global[i].y;

				// move
				for (int j = 0; j < n; j++) {
					global[j].x -= dx;
					global[j].y -= dy;
				}

				//System.out.println(Arrays.toString(global));
				//System.out.println(x)
				
				boolean check = true;
				for (int p = 0; p < m; p++) {
					boolean found = false;
					for (int j = 0; j < n; j++) {
						if (points[p].x == global[j].x && 
								points[p].y == global[j].y) {
							found = true;
							break;
						}
					}
					
					if (!found) {
						check = false;
						break;
					}
				}

				if (check) {
					System.out.println((dx - d_x) + " "
							+ (dy - d_y));
					break;
				}

				// rev_move
				for (int j = 0; j < n; j++) {
					global[j].x += dx;
					global[j].y += dy;
				}
			}
		}
	}
}