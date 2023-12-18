
import java.io.*;
import java.util.*;


// æ­Ôá¤Æ±ëB
// âè¶É¢ÄÈ­ÄàâèZbgÍ¡Åæªª0ÅI¹Å éB
// âèZbgÌJèÔµÉú»Rê

// 2011/10/18

//@0113 zÂ¬
public class Main {

	
	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int[] ri = readIntArray();
		if (ri == null) 
			return false; // ¨µÜ¢

		int p = ri[0];
		int q = ri[1];

		int w = p * 10;
	
		String s = "";
		String t = null; // zÂµ½Æ«É^^^
		List<Integer> amari = new ArrayList<Integer>();
		while(w != 0) {
			int idx = amari.indexOf(w);
			if (idx >= 0) {
				// zÂµ½
				t = "";
				for(int i = 0; i < amari.size(); i++) {
					if (i < idx) {
						t += " ";
					}
					else {
						t += "^";
					}
				}
				break;
			}
			amari.add(w);
			int sh = w / q;
			s += "" + sh;
			w = (w % q) * 10;
		}

		// ðÌ\¦
		System.out.printf("%s\n", s);
		if (t != null)
			System.out.printf("%s\n", t);
		
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