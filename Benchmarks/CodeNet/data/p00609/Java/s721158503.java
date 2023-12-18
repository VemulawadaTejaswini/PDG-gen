import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int maxSize = 100000;
		int radius;
		int[] plane_x = new int[maxSize];
		int[] plane_y = new int[maxSize];
		int[] energy_x = new int[maxSize];
		int[] energy_y = new int[maxSize];
		
		while(scanner.hasNext()) {
			int pn = scanner.nextInt();
			int en = scanner.nextInt();
			radius = scanner.nextInt();
			
			if (pn == 0 && en == 0) {return;}
			
			for(int i = 0; i < pn; i++) {
				plane_x[i] = scanner.nextInt();
				plane_y[i] = scanner.nextInt();
			}
			for(int i = 0; i < en; i++) {
				energy_x[i] = scanner.nextInt();
				energy_y[i] = scanner.nextInt();
			}
			
			int power = 0;
			for(int p = 0; p < pn; p++) {
				for(int e = 0; e < en; e++) {
					double distance = Math.sqrt((plane_x[p] - energy_x[e]) * (plane_x[p] - energy_x[e]) + (plane_y[p] - energy_y[e]) * (plane_y[p] - energy_y[e]));
					if (distance - 2 * radius <= 2 * radius) {
						power++;
					}
				}
			}
			System.out.println(power);
		}
	}
}