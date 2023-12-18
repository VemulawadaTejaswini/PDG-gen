import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int[] g = {200, 300, 500};
		int[] price = {380, 550, 850};
		int[] set = {5, 4, 3};
		double[] off = {0.8, 0.85, 0.88};
		
		String line = sc.nextLine();
		while (line.equals("0") == false) {
			int total = Integer.parseInt(line);
			
			int min = 0;
			for (int i = 0; i < g.length; i++) {
				if (total % g[i] != 0) continue;
				
				int price_t = (int)((total / (g[i] * set[i])) * price[i] * set[i] * off[i]);
				price_t = price_t + (total % (g[i] * set[i])) * price[i];
				
				if ((min == 0) || (min > price_t)) min = price_t; 
			}
			System.out.println(min);
			
			line = sc.nextLine();
		}
	}
}