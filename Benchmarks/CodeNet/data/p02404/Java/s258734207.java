import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		int h;
		int w;
		
		while(true) {
			
			h = Integer.parseInt(null, stdin.nextInt());
			w = Integer.parseInt(null, stdin.nextInt());
			
			if (h == 0 && w == 0) break;
			
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if (i == 0 || j == 0 || i == h - 1|| j == w - 1) {
						System.out.println("#");
					} else {
						System.out.println(".");
					}
				}
				System.out.println();
			} 
			System.out.println();
		}
		stdin.close();
	}
}