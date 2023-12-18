
import java.io.*;
import java.math.BigInteger;
import java.util.*;


// æ­Ôá¤Æ±ëB
// âè¶É¢ÄÈ­ÄàâèZbgÍ¡Åæªª0ÅI¹Å éB
// âèZbgÌJèÔµÉú»Rê

// 2011/10/18

//@0110 ¢ÊZ
public class Main {

	
	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		String s = reader.readLine();
		if (s == null)
			return false; /* ¨µÜ¢ */
		
		for(int i = 0; i < 10; i++) {
			String s2 = s.replace('X', (char)('0' + i));
			String reg = "([0-9]+)\\+([0-9]+)=([0-9]+)";
			String st1 = s2.replaceAll(reg, "$1");
			String st2 = s2.replaceAll(reg, "$2");
			String st3 = s2.replaceAll(reg, "$3");
			if (st1.charAt(0) == '0')
				continue;
			if (st2.charAt(0) == '0')
				continue;
			if (st3.charAt(0) == '0')
				continue;
			BigInteger v1 = new BigInteger(st1);
			BigInteger v2 = new BigInteger(st2);
			BigInteger v3 = new BigInteger(st3);
			if (v1.add(v2).equals(v3)) {
				System.out.printf("%d\n", i);
				return true;
			}
		}
		System.out.printf("NA\n");
		
		return true; /* ³íI¹ Ö */
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "XXXXXXXXXX0000022222+11111111110000022222=22222222220000044444\n";

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
	

	// WüÍæè@1sªÌXy[XæØèÌ®lðÇÞ
	private static int[] readIntArray() throws IOException {
		
		String s = reader.readLine();
		String[] sp = s.split(" ");
		int[] a = new int[sp.length];
		for(int i = 0; i < sp.length; i++) {
			a[i] = Integer.parseInt(sp[i]);
		}
		return a;
	}
		
}