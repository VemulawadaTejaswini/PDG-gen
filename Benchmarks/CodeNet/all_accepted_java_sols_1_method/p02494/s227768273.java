import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int h = stdIn.nextInt();
			int w = stdIn.nextInt();
		
			if(h == 0 && w == 0) {
				break;
			}
			for(int i = 0 ; i < h; i++) {
				for(int j = 0; j < w; j++) {
					System.out.print("#");
				}
					System.out.println();
			}
			System.out.println();
		}
	}
	
}