import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	private int[] data;
	
	private ArrayList<String> memo;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int counter = 0;
		int maxw = Integer.parseInt(sc.nextLine());
		while (maxw != 0) {
			counter++;
			
			int[] table = new int[maxw + 1];
			for (int i = 0; i < table.length; i++) {
				table[i] = 0;
			}
			
			int num = Integer.parseInt(sc.nextLine());

			int value, w;
			for (int i = 0; i < num; i++) {
				String[] nico = sc.nextLine().split(",");

				value = Integer.parseInt(nico[0]);
				w = Integer.parseInt(nico[1]);
				
				ArrayList<Integer> al = new ArrayList<Integer>();
				for (int j = 0; j < table.length; j++) {
					if (al.contains(j)) continue;
					if ((table[j] != 0) || (j == 0)) {
						if ((j + w) < table.length) {
							if (table[j + w] < (table[j] + value)) table[j + w] = (table[j] + value);
							al.add(j + w);
						}
					}
				}
			}
			
			int max = 0;
			int index = 0;
			for (int i = 0; i < table.length; i++) {
				if (max < table[i]) {
					max = table[i];
					index = i;
				}
			}

			System.out.println("Case " + counter);
			System.out.println(max);
			System.out.println(index);
			maxw = Integer.parseInt(sc.nextLine());
		}
	}
}