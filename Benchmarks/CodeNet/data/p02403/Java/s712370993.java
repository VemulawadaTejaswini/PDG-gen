import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int H, W; 
		
		
		do {
			H = stdIn.nextInt();
			W = stdIn.nextInt();
			
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(j == W - 1) {
						System.out.println("#");
					}else {
						System.out.print("#");
					}
				}
				System.out.print("\n");
			}
			
		}while(H != 0 && W != 0);			
	}
}
