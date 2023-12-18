import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int n;
		double dis = 0.0;
		double total = 0.0;
		double vector_total = 0.0;
		double max = 0.0;
		
		n = scan.nextInt();
		int vectorX[] = new int[n];
		int vectorY[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			vectorX[i] = scan.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			vectorY[i] = scan.nextInt();
		}
		
		for (int p = 1; p <= 4; p++) {
			total = 0.0;
			
			switch (p) {
			case 1:
				for (int i = 0; i < n; i++) {
					vector_total = (vectorX[i] - vectorY[i]);
					if (vector_total < 0) {
						vector_total *= -1;
					}
					total += vector_total;
				}
				dis = total;
				break;
			case 2:
				for (int i = 0; i < n; i++) {
					total += Math.pow((vectorX[i] - vectorY[i]), p);
				}
				dis = Math.sqrt(total);
				break;
			case 3:
				for (int i = 0; i < n; i++) {
					vector_total = Math.pow((vectorX[i] - vectorY[i]), p);
					if (vector_total < 0) {
						vector_total *= -1;
					}
					total += vector_total;
				}
				dis = Math.cbrt(total);
				break;
			case 4:
				for (int i = 0; i < n; i++) {
					vector_total = (vectorX[i] - vectorY[i]);
					if (vector_total < 0) {
						vector_total *= -1;
					}
					if ( i == 0) {
						max = vector_total;
					} else {
						max = Math.max(max, vector_total);
					}
				}
				dis = max;
				
				break;
			default:
				break;
			}
			
			System.out.println(dis);
			
		}
		
		
		
		scan.close();
	}
}

