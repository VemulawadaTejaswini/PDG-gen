// Itp1_5_b.java
import java.io.*;
import java.lang.Integer;
public class Main 
{
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
loop:		while(true) {
				String in  = br.readLine() ;
				String[] hw = in.split(" ");
				int height = Integer.parseInt(hw[0]);
				int width  = Integer.parseInt(hw[1]);
				if ( height == 0 || width == 0 ) {
					break;
				}
				for( int i = 1 ; i <= height ; i++ ) {
					for( int j = 1 ; j <= width ; j++ ) {
						if ( i == 1 || i == height ) {
							System.out.print("#");
						} else {
							if ( j == 1 || j == width ) {
								System.out.print("#");
							} else {
								System.out.print(".");
							}
						}
					}
					System.out.println("");
				}
				System.out.println("");
			}
		} catch ( IOException e ) {
			System.out.println("??¨??????????????????????????????");
		}
	}
}