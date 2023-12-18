
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main( String[] args ) {
		try {
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
			String tmp = br.readLine();
			String[] plainNumber = tmp.split(" ");
			int height = Integer.parseInt(plainNumber[0]);
			int width  = Integer.parseInt(plainNumber[1]);

			if( height == 0 && width == 0 ) {
				System.exit(0);
			}

			if( height <= 100 && width <= 100 ) {
				for(int Hi = 0; Hi < height; Hi ++) {
					for(int Wi = 0; Wi < width; Wi++ ){
						if( (Hi % 2 == 0 && Wi % 2 == 0) || (Hi % 2 != 0 && Wi % 2 != 0) ) {
							System.out.print("#");
						} else if ( (Hi % 2 != 0 && Wi % 2 == 0) || (Hi % 2 == 0 && Wi % 2 != 0)){
							System.out.print(".");
						}
					}
					System.out.println();
				}
			}


		} catch( IOException e ) {
			e.printStackTrace();
		}
	}
}