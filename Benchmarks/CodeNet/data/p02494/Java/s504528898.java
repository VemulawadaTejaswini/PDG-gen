import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int w = 0, h = 0;
		while( (w = Integer.parseInt(scan.next())) != 0 && (h = Integer.parseInt(scan.next())) != 0 ){
			for( int i = 0; i < h; i++ ){
				for( int j = 0; j < w; j++ ){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
		return;
	}
}