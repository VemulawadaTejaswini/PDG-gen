
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] strlist = str.split(" ");
		int sx = Integer.parseInt(strlist[0]);
		int sy = Integer.parseInt(strlist[1]);
		int tx = Integer.parseInt(strlist[2]);
		int ty = Integer.parseInt(strlist[3]);

		int x = tx -sx;
		int y = ty -sy;

		for(int i=0; i<y; i++){
			System.out.print("U");
		}
		for(int i=0; i<x; i++){
			System.out.print("R");
		}
		for(int i=0; i<y; i++){
			System.out.print("D");
		}
		for(int i=0; i<x; i++){
			System.out.print("L");
		}

		System.out.print("L");

		for(int i=0; i<y+1; i++){
			System.out.print("U");
		}
		for(int i=0; i<x+1; i++){
			System.out.print("R");
		}

		System.out.print("D");
		System.out.print("R");

		for(int i=0; i<y+1; i++){
			System.out.print("D");
		}
		for(int i=0; i<x+1; i++){
			System.out.print("L");
		}

		System.out.print("U");

	}

}
