
import java.io.*;
import java.util.*;


// 2011/10/23

// 0141 ®é®éÍl
public class Main {

	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int size = readIntArray()[0];
		
		int[][] map = new int[size][size];
		int x = 0;
		int y = 0;
		int v = 0; // muki
		boolean lastm = false; //OñÈªÁ½©?
				
		
		loop:
		for(int step = 0; step < 10000; step++) {
			map[x][y] = 1;
			int xx = 0;
			int yy = 0;
			boolean m = false;
			for(int s = 0;;s++) {
				if (s > 2)
					break loop;
				if (v == 0) { // º
					xx = 0;
					yy = 1;
				}
				else if (v == 1) {
					xx = 1;
					yy = 0;
				}
				else if (v == 2) {
					xx = 0;
					yy = -1;
				}
				else if (v == 3) {
					xx = -1;
					yy = 0;
				}
				if (x + xx < 0 || x + xx >= size || y + yy < 0 || y + yy >= size ||
						(x + xx*2 >= 0 && x + xx*2 < size && y + yy*2 >= 0 && y + yy*2 < size && map[x+xx*2][y+yy*2] != 0)) {
					if (lastm)
						break loop;
					v = (v + 1) % 4;
					m = true;
					continue;
				}
				break;
			}
			lastm = m;
			x += xx;
			y += yy;
		}
		
		for(y = 0; y < size; y++) {
			for(x = 0; x < size; x++) {
				System.out.printf("%s", map[x][size - 1 - y] != 0 ? "#" : " ");
			}
			System.out.printf("\n");
		}
		
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "1:15:";

			inputStr = inputStr.replace(":", "\n");

			reader = new BufferedReader(new StringReader(inputStr)); 

		}
		else {
			log = new PrintStream(new OutputStream() { public void write(int b) {} } ); // «ÌÄ
			reader = new BufferedReader(new InputStreamReader(System.in)); // R\[©ç
		}
		
		int N = readIntArray()[0];

		for(int i = 0; i < N; i++) {
			if (i != 0)
				System.out.printf("\n");
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