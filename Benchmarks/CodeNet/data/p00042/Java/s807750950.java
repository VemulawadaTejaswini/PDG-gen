import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int counter = 0;
		int maxw = Integer.parseInt(sc.nextLine());
		while (maxw != 0) {
			counter++;
			
			int num = Integer.parseInt(sc.nextLine());

			int[][] table = new int[num + 1][maxw + 1];
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[0].length; j++) {
					table[i][j] = 0;
				}
			}
			
			int value, w;
			for (int i = 0; i < num; i++) {
				String[] nico = sc.nextLine().split(",");

				value = Integer.parseInt(nico[0]);
				w = Integer.parseInt(nico[1]);
				
				for (int j = 0; j < table[0].length; j++) {
					if ((j - w) >= 0) {
						if (table[i][j] > table[i][j - w] + value) table[i + 1][j] = table[i][j];
						else table[i + 1][j] = table[i][j - w] + value;
					}
				}
			}
			
			int max = 0;
			int index = 0;
			for (int i = 0; i < table[0].length; i++) {
				if (max < table[num][i]) {
					max = table[num][i];
					index = i;
				}
			}

			System.out.println("Case " + counter + ":");
			System.out.println(max);
			System.out.println(index);
			maxw = Integer.parseInt(sc.nextLine());
		}
	}
}