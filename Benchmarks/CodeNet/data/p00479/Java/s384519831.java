
import java.io.*;
import java.util.*;


// 2011/10/24 
// 44 27.672

// 0556 Tile
public class Main {

	int[] roundR(int[] cube) {
		int[] newCube = new int[6];
		System.arraycopy(cube, 0, newCube, 0, 6);
		newCube[0] = cube[1];
		newCube[1] = cube[5];
		newCube[5] = cube[4];
		newCube[4] = cube[0];
		return newCube;
	}
	
	int[] roundU(int[] cube) {
		int[] newCube = new int[6];
		System.arraycopy(cube, 0, newCube, 0, 6);
		newCube[1] = cube[2];
		newCube[2] = cube[4];
		newCube[4] = cube[3];
		newCube[3] = cube[1];
		return newCube;
	}
	
	// L[u 24Ï»
	int[] change(int[] cube, int n) {
	
		int men = n / 4;
		if (men == 0) {
			;
		}
		else if (men == 1) {
			cube = roundR(cube);
		}
		else if (men == 2) {
			cube = roundR(cube);
			cube = roundR(cube);
		}
		else if (men == 3) {
			cube = roundR(cube);
			cube = roundR(cube);
			cube = roundR(cube);
		}
		else if (men == 4) {
			cube = roundU(cube);
			cube = roundR(cube);
		}
		else {
			cube = roundU(cube);
			cube = roundR(cube);
			cube = roundR(cube);
			cube = roundR(cube);
		}
		
		for(int i = 0; i < n % 4; i++) {
			cube = roundU(cube);
		}
		return cube;
	}
	
	// 2ÂÌL[uª¯¶©Ç¤©
	boolean equals(int[] cube1, int[] cube2) {
		
		for(int i = 0; i < 24; i++) {
			int[] c = change(cube1, i);
			boolean b = Arrays.equals(c, cube2);
			if (b)
				return true;
		}
		return false;
	}
	

	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int N = readIntArray()[0];
		//if (n == 0)
		//	return false;
		
		int K = readIntArray()[0];

		for(int i = 0; i < K; i++) {
			int[] ir = readIntArray();
			int x = ir[0] - 1;
			int y = ir[1] - 1;
			if (x >= N / 2) {
				x = N - 1- x;
			}
			if (y >= N / 2) {
				y = N - 1 - y;
			}
			int c = (Math.min(x, y) % 3) + 1;
			
			System.out.printf("%d\n", c);
		}
		
		
		return false;
//		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "3:Cyan Yellow Red Magenta Green Blue:Cyan Yellow Red Magenta Green Blue:Red Yellow Magenta Blue Green Cyan:0:";

			inputStr = inputStr.replace(":", "\n");

			reader = new BufferedReader(new StringReader(inputStr)); 

		}
		else {
			log = new PrintStream(new OutputStream() { public void write(int b) {} } ); // «ÌÄ
			reader = new BufferedReader(new InputStreamReader(System.in)); // R\[©ç
		}
		
		int N = Integer.MAX_VALUE;
		//int N = readIntArray()[0];

		for(int i = 0; i < N; i++) {
			boolean b = new Main().main();
			if (!b)
				break;
		}		
		
		reader.close();
	}

	
	static PrintStream log;
	static BufferedReader reader;
	

	// WüÍæè1sªÌæØè¶æØèÅÌ®lðÇÞ
	// EOFÌêÍnullðÔ·
	private static int[] readIntArray() throws IOException {

		String s = null;
		for(;;) {
			s = reader.readLine();
//			log.printf("%s\n", s);
			if (s == null)
				return null;
			s = s.trim();
			if (s.length() != 0) // ¦¦¦@Ç¤àËRósðÇÞ±Æª éBÇÝòÎ·Æ¤Ü­¢­çµ¢BBBB
				break;
		}
		
		String[] sp = s.split("[ ,]"); // æØè¶ÍXy[X©J}
		int[] a = new int[sp.length];
		for(int i = 0; i < sp.length; i++) {
			a[i] = Integer.parseInt(sp[i]);
		}
		return a;
	}
		
}