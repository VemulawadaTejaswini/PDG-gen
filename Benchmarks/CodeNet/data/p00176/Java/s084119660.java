import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		String st;
		int r, g, b, ans;
		double min, db;
		
		String[] color = {"black", "blue", "lime", "aqua", "red", "fuchsia", "yellow", "white"};		
		int[][] code = {{0, 0, 0},
						{0, 0, 255},
						{0, 255, 0},
						{0, 255, 255},
						{255, 0, 0},
						{255, 0, 255},
						{255, 255, 0},
						{255, 255, 255}						
						};
		
		while(true) {
			st = scan.next();
			
			if(st.equals("0")) break;

			min = Integer.MAX_VALUE;
			ans = 0;
			
			r = Integer.parseInt(st.substring(1,3), 16);
			g = Integer.parseInt(st.substring(3,5), 16);
			b = Integer.parseInt(st.substring(5,7), 16);
			
			for(int i = 0; i < 8; i++) {
				db = Math.sqrt(Math.pow(r - code[i][0], 2) + Math.pow(g - code[i][1], 2) + Math.pow(b - code[i][2], 2));
				
				if(db < min) {
					ans = i;
					min = db;
				}
			}
			System.out.println(color[ans]);
		}
		
		scan.close();
	}
}