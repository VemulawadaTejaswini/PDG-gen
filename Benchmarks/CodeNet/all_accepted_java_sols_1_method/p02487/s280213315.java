import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int w = 0, h = 0;
		while( (h = Integer.parseInt(scan.next())) != 0 && (w = Integer.parseInt(scan.next())) != 0 ){
			for( int i = 0; i < h; i++ ){
				System.out.print("#");
				for( int j = 1; j < w - 1; j++ ){
					if( i == 0 || i == h - 1 ){
						System.out.print("#");
					}else{
						System.out.print(".");
					}
				}
				System.out.println("#");
			}
			System.out.println();
		}
		return;
	}
}