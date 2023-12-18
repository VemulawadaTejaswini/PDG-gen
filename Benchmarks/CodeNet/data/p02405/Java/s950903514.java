import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int H, W; 		
		
		do {
			H = stdIn.nextInt();
			W = stdIn.nextInt();
			
			if( W == 0 && H == 0)break;
			
			for(int i = 1; i <= H; i++) {
				for(int j = 1; j <= W; j++) {
					if( i % 2 == 0) {
						if( j % 2 == 0) {
							if(j == W) {
								System.out.println(".");
							}else {
								System.out.print(".");
							}
						}else {
							if(j == W) {
								System.out.println("#");
							}else {
								System.out.print("#");
							}
						}
					}else {
						if( j % 2 == 0) {
							if(j == W) {
								System.out.println("#");
							}else {
								System.out.print("#");
							}
						}else {
							if(j == W) {
								System.out.println(".");
							}else {
								System.out.print(".");
							}
						}
					}
				}
		
			}
			
			System.out.print("\n");
			
		}while(true);			
	}
}
