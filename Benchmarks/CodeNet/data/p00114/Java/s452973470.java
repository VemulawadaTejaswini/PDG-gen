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

			int[] a = new int[3];
			int[] m = new int[3];
			int[] xyz = new int[3];
			int[] r = new int[3];

			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(nico[i * 2]);
				m[i] = Integer.parseInt(nico[i * 2 + 1]);
				xyz[i] = 1;
				r[i] = 0;
			}
			
			int max = 0;
			int count = 0;
			
			boolean flag = false;
			while (flag == false) {
				flag = true;
				count++;
	
				for (int i = 0; i < xyz.length; i++) {
					if (r[i] == 0) xyz[i] = (a[i] * xyz[i]) % m[i];

					if (xyz[i] == 1) {
						if (r[i] == 0) {
							r[i] = count;
							if (max < count) max = count;
						}
					} else {
						flag = false;
					}
				}
			}

			count = 1;
			flag = false;
			
			int sum = 0;
			while (flag == false) {
				sum = max * count;
				flag = true;
				
				for (int i = 0; i < r.length; i++) {
					if (sum % r[i] != 0) {
						flag = false;
						break;
					}
				}
				
				count++;
			}
			System.out.println(sum);

			line = sc.nextLine();
		}
	}
}