import java.io.*;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String sz_input = br.readLine();
			String[] sz_num = sz_input.split(" ");
			int H = Integer.parseInt(sz_num[0]);
			int W = Integer.parseInt(sz_num[1]);
			
			if (H == 0 && W == 0) break;
			
			for (int y = 0; y < H; y++) {
				for (int x = 0; x < W; x++) {
					System.out.print("#");
					x++;
					if (x < W) System.out.print(".");
				}
				System.out.println();
				y++;
				
				if (y >= H) break;
				for (int x = 0; x < W; x++) {
					System.out.print(".");
					x++;
					if (x < W) System.out.print("#");
				}
				System.out.println();
			}
			
			System.out.println();
		}
	}
}