
import java.io.*;
import java.util.*;


// æ­Ôá¤Æ±ëB
// âè¶É¢ÄÈ­ÄàâèZbgÍ¡Åæªª0ÅI¹Å éB
// âèZbgÌJèÔµÉú»Rê

// 2011/10/18

//@0114 
public class Main {

	
	int gcm(int a, int b) {
		
		while(b != 0) {
			int t = a % b;
			a = b;
			b = t;
		}
		return a;
	}
	
	int lcm(int a, int b) {
		return a * b / gcm(a, b);
	}
	
	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int[] ri = readIntArray();
		int a1 = ri[0];
		int m1 = ri[1];
		int a2 = ri[2];
		int m2 = ri[3];
		int a3 = ri[4];
		int m3 = ri[5];
		if (a1 == 0 && m1 == 0 && a2 == 0 && m2 == 0 && a3 == 0 && m3 == 0) 
			return false; // ¨µÜ¢

		int i;
		int x = 1;
		for(i = 1;; i++) {
			x = (a1 * x) % m1;
			if (x == 1)
				break;
		}
		int v1 = i;
		x = 1;
		for(i = 1;; i++) {
			x = (a2 * x) % m2;
			if (x == 1)
				break;
		}
		int v2 = i;
		x = 1;
		for(i = 1;; i++) {
			x = (a3 * x) % m3;
			if (x == 1)
				break;
		}
		int v3 = i;
		int r = lcm(lcm(v1, v2), v3);
		
		
		// ðÌ\¦
		System.out.printf("%d\n", r);
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "1 459550\n";

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
	

	// WüÍæè1sªÌXy[XæØèÌ®lðÇÞ
	// EOFÌêÍnullðÔ·
	private static int[] readIntArray() throws IOException {
		
		String s = reader.readLine();
		if (s == null)
			return null;
		String[] sp = s.split(" ");
		int[] a = new int[sp.length];
		for(int i = 0; i < sp.length; i++) {
			a[i] = Integer.parseInt(sp[i]);
		}
		return a;
	}
		
}