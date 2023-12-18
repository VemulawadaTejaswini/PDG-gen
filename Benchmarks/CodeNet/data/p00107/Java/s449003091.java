
import java.io.*;
import java.util.*;


// 44 27.672
// 46 33.227 240 2011/10/28
// 2011/10/29

// 0107 `[Y
public class Main {

	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int[] ir = readIntArray();
		if (ir[0] == 0 && ir[1] == 0 && ir[2] == 0)
			return false;
		Arrays.sort(ir);
		
		int n = readIntArray()[0];
		for(int i = 0; i < n; i++) {
			int r = readIntArray()[0];
			
			boolean isOK = false;
			if (ir[0] * ir[0] + ir[1] * ir[1] < r * r * 4)
				isOK = true;
			
			System.out.printf("%s\n", isOK ? "OK":"NA");
		}
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "10 6 8:5:4:8:6:2:5:0 0 0:";
			
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