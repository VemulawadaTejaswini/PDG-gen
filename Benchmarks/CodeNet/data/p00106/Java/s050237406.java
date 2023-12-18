import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	private Scanner sc;

	private int[] g = {200, 300, 500};
	private int[] price = {380, 550, 850};
	private int[] set = {5, 4, 3};
	
	double[] off = {0.8, 0.85, 0.88};
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		while (line.equals("0") == false) {
			int total = Integer.parseInt(line);
			
			System.out.println(search(total));
			
			line = sc.nextLine();
		}
	}
	
	public int search(int total) {
		if (total < 0) return -1;
		if (total == 0) return 0;
		
		int min = -1;
		
		for (int i = 0; i < 3; i++) {
			int tmp = search(total - (g[i] * set[i]));
			if (tmp != -1) {
				tmp = tmp + (int)(price[i] * set[i] * off[i]);
				if ((min == -1) || (min > tmp)) min = tmp;
			}

			tmp = search(total - (g[i]));
			if (tmp != -1) {
				tmp = tmp + price[i];
				if ((min == -1) || (min > tmp)) min = tmp;
			}
		}

		return min;
	}
}