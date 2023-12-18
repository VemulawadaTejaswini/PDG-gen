
import java.io.*;
import java.util.*;


// 2011/10/23

// 0077 Run Length
public class Main {

	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		String s = reader.readLine();
		if (s == null)
			return false;
		
		String d = "";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '@') {
				char r = s.charAt(++i);
				c = s.charAt(++i);
				for(int j = 0; j < r - '0'; j++) {
					d += c;
				}
			}
			else {
				d += c;
			}
		}
		
			
		// ðÌ\¦
		System.out.printf("%s\n", d);
		
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "ab@5C1@8050:";

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