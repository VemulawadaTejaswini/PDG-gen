import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		int h = stdin.nextInt();
		int w = stdin.nextInt();
		
		while(true) {
		for(int i = 0; i < h; i++) {
			for (int j = 0; j < w; i++) {
				System.out.println("#");
			}
			System.out.println();
		}
			
			
			if(h == 0 && w == 0) {
				break;
			}
		
		
		stdin.close();
		}
	}

}