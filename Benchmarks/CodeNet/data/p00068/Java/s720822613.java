import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	int[][] map;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine() == true) {
			int lines = Integer.parseInt(sc.nextLine());
			if (lines == 0) break;
			
			double[][] points = new double[lines][2];
			for (int i = 0; i < lines; i++) {
				String[] nico = sc.nextLine().split(",");
				
				for (int j = 0; j < nico.length; j++) {
					points[i][j] = Double.parseDouble(nico[j]);
				}
			}
			
			boolean[] flag = new boolean[points.length];
			for (int i = 0; i < flag.length; i++) {
				flag[i] = true;
			}
			
			for (int i = 0; i < points.length; i++) {
				for (int j = (i + 1); j < points.length; j++) {
					double dx = points[j][0] - points[i][0];
					double dy = points[j][1] - points[i][1];
					
					boolean judge = true;
					if (dx != 0.0) {
						double a = dy / dx;
						double b = points[i][1] - a * points[i][0];

						double side = 0.0;
						for (int k = 0; k < points.length; k++) {
							double nside = 0.0;
							
							if ((k != i) && (k != j)) {
								nside = points[k][1] - (a * points[k][0] + b);
							}
							
							if (((side != 0.0) && (side * nside < 0.0)) || (nside == 0.0)) {
								judge = false;
								break;
							}
							side = nside;
						}
					} else {
						double side = 0.0;
						for (int k = 0; k < points.length; k++) {
							double nside = 0.0;
							
							if ((k != i) && (k != j)) {
								nside = points[k][0] - points[i][0];
							}

							if (((side != 0.0) && (side * nside < 0.0)) || (nside == 0.0)) {
								judge = false;
								break;
							}
							
							side = nside;
						}
					}
					
					if (judge == true) {
						flag[i] = false;
						flag[j] = false;
					}
				}
			}
			
			int cnt = 0;
			for (int i = 0; i < flag.length; i++) {
				if (flag[i] == true) cnt++;
			}
			
			System.out.println(cnt);
		}
	}
}