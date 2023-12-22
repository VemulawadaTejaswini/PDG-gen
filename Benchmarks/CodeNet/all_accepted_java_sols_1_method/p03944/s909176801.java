	
	import java.math.BigInteger;
	import java.util.Scanner;
	
	class Main {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int w = sc.nextInt();
			int h = sc.nextInt();
			int n = sc.nextInt();
			
			int[][] list = new int[n][3];
			for (int i = 0; i < n; i++) {
				list[i][0] = sc.nextInt();
				list[i][1] = sc.nextInt();
				list[i][2] = sc.nextInt();
			}
			
			int x1 = 0;
			int x2 = w;
			int y1 = 0;
			int y2 = h;
			for (int i = 0; i < list.length; i++) {
				int temp = list[i][2];
				switch (temp) {
				case 1:
					x1 = Math.max(x1, list[i][0]);
					break;
				case 2:
					x2 = Math.min(x2, list[i][0]);
					break;
				case 3:
					y1 = Math.max(y1, list[i][1]);
					break;
				case 4:
					y2 = Math.min(y2, list[i][1]);
					break;
				}
			}
			
			if (x2 <= x1 || y2 <= y1) {
				System.out.println(0);
			} else {
				
				System.out.println((x2 - x1) * (y2 - y1));
				
			}
			
			
		}
	}