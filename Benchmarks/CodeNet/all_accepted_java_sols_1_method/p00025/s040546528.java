

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] a = new int[4];
		int[] b = new int[4];
		
		while (sc.hasNext()) {
			for (int i = 0; i < 4; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < 4; i++) {
				b[i] = sc.nextInt();
			}
			
			int hit = 0;
			int blow = 0;
		
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (i == j && a[i] == b[j])
						hit++;
					if (i != j && a[i] == b[j])
						blow++;
				}
			}
			
			System.out.println(hit + " " + blow);
		}
	}

}