import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		String line = sc.nextLine();
		while (line.equals("0 0 0 0 0 0") == false) {
			String[] nico = line.split(" ");

			int a1 = Integer.parseInt(nico[0]);
			int a2 = Integer.parseInt(nico[2]);
			int a3 = Integer.parseInt(nico[4]);

			int m1 = Integer.parseInt(nico[1]);
			int m2 = Integer.parseInt(nico[3]);
			int m3 = Integer.parseInt(nico[5]);

			int x = 1;
			int y = 1;
			int z = 1;

			int[] r = new int[3];
			for (int i = 0; i < r.length; i++) {
				r[i] = 0;
			}
			
			int i = 0;
			int width = 1;
			
			boolean flag = false;
			while (flag == false) {
				flag = true;
				
				for (int j = 0; j < width; j++) {
					if (r[0] == 0) x = (a1 * x) % m1;
					if (r[1] == 0) y = (a2 * y) % m2;
					if (r[2] == 0) z = (a3 * z) % m3;
				}

				i = i + width;
				if (x == 1) {
					if (r[0] == 0) {
						r[0] = i;
						width = i;
					}
				} else {
					flag = false;
				}
				
				if (y == 1) {
					if (r[1] == 0) {
						r[1] = i;
						width = i;
					}
				} else {
					flag = false;
				}
				
				if (z == 1) {
					if (r[2] == 0) {
						r[2] = i;
						width = i;
					}
				} else {
					flag = false;
				}
			}
			
			System.out.println(i);

			line = sc.nextLine();
		}
	}
}