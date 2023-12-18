
import java.io.*;
import java.util.*;


// 44 27.672
// 46 33.227 240 2011/10/28
// 2011/10/29

// 0108 o»pxì
public class Main {

	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int n = readIntArray()[0];
		if (n == 0)
			return false;
		
		int[] a = readIntArray();
		
		int scnt;
		for(scnt = 0;; scnt++) {
			
			boolean noMatch = false;
			int[] a2 = new int[n];
			for(int i = 0; i < n; i++) {
				int c = 0;
				for(int j = 0; j < n; j++) {
					if (a[i] == a[j])
						c++;
				}
				a2[i] = c;
				if (a[i] != c)
					noMatch = true;
			}
			if (!noMatch)
				break;
			a = a2;
		}
		
		System.out.printf("%d\n", scnt);
		for(int i = 0; i < n; i++) {
			if (i != 0)
				System.out.printf(" ");
			System.out.printf("%d", a[i]);
		}
		System.out.printf("\n");
		
		return true; // ³íI¹ Ö
	}
	

	private final static boolean DEBUG = true;  // debug
//	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "10:4 5 1 1 4 5 12 3 5 4:0:";
			
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