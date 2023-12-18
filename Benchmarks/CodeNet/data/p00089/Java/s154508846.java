
import java.io.*;
import java.util.*;


// 2011/10/23

// 0089 Ðµ`
public class Main {

	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		List<int[]> list = new ArrayList<int[]>();
		
		int size = 0;
		for(int i = 0;; i++) {
			if (size != 0 && i >= size * 2 - 1)
				break;
			int[] ia = readIntArray();
			list.add(ia);
			if (size == 0 && ia.length < i + 1)
				size = i;
		}
		

		int[] prevLine = new int[] { list.get(0)[0] };
		
		for(int y = 1; y < size * 2 - 1; y++) {
			
			int xSize = y + 1;
			if (y >= size) {
				xSize = size * 2 -1 - y;
			}
			log.printf("xSize=%d\n", xSize); 
			int[] line = new int[xSize];
			for(int x = 0; x < xSize; x++) {
				int max = 0;
				if (y < size) { // O¼
					if (x - 1 >= 0) {
						max = prevLine[x - 1];
					}
					if (x < prevLine.length) {
						max = Math.max(max, prevLine[x]);
					}
				}
				else { // ã¼
					if (x >= 0) {
						max = prevLine[x];
					}
					if (x + 1 < prevLine.length) {
						max = Math.max(max, prevLine[x + 1]);
					}
				}
				max += list.get(y)[x];
				line[x] = max;
				log.printf("%d ", max);
			}
			log.printf("\n");
			
			prevLine = line;
		}
		
			
		// ðÌ\¦
		System.out.printf("%d\n", prevLine[0]);
		
		
		return false;
		//return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "7:3,8:8,1,0:2,7,4,4:4,5,2,6,5:2,7,4,4:8,1,0:3,8:7:";

			inputStr = inputStr.replace(":", "\n");

			reader = new BufferedReader(new StringReader(inputStr)); 

		}
		else {
			log = new PrintStream(new OutputStream() { public void write(int b) {} } ); // «ÌÄ
			reader = new BufferedReader(new InputStreamReader(System.in)); // R\[©ç
		}
		
		//int N = readIntArray()[0];

		for(int i = 0; /*i < N*/; i++) {
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
			log.printf("%s\n", s);
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