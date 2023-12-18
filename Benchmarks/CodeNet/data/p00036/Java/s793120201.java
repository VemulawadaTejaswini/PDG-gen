import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNext() == true) {
			int[][] map = new int[8][8];

			for (int i = 0; i < 8; i++) {
				String line = sc.nextLine();
				
				for (int j = 0; j < 8; j++) {
					map[i][j] = line.charAt(j) - '0';
				}
			}
			sc.nextLine();
			
			int state = 0;
			int max = 8;
			int k = 0;
			int left = 0;
			
			boolean end = false;
			for (int i = 0; i < max; i++) {
				for (int j = (k + left); j < 8; j++) {
					if (map[i][j] == 1) {
						switch (state) {
						case 0:
							state = 1;
							max = i + 4;
							k = j - 1;
							
							if (j == 0) {
								left = 1;
							}
							break;
							
						case 1:
							state = 2;
							break;

						case 2:
							state = 3;
							break;

						case 3:
							System.out.println("C");
							end = true;
							break;
							
						case 4:
							if (j == k) {
								System.out.println("D");
								end = true;
							} else {
								state = 6;
							}
							break;
							
						case 5:
							if (j == k) {
								System.out.println("G");
								end = true;
							} else if (j == (k + 1)) {
								System.out.println("A");
								end = true;
							} else {
								System.out.println("E");
								end = true;
							}
							break;
								
						case 6:
							System.out.println("F");
							end = true;
							break;
						}
					}
					if (end == true) break;
				}
				
				if ((state == 1) || (state == 2)) {
					state = state + 3;
				} if (state == 6) {
					System.out.println("B");
					end = true;
				}
				
				if (end == true) break;
 			}
		}
	}
}