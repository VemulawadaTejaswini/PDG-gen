import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while( true ){
			int h = Integer.parseInt(scan.next());
			int w = Integer.parseInt(scan.next());
			if( h == 0 && w == 0 ){
				break;
			}
			for( int i = 0; i < h; i++ ){
				for( int j = 0; j < w; j++ ){
					if( (i + j) % 2 == 0 ){
						System.out.print("#");
					}else{
						System.out.print(".");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		return;
	}
}