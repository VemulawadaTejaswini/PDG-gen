
import java.io.*;
import java.util.*;


// 2011/10/21

//@2101@®S 
public class Main {

	// föªð·é
	//  zñÉfÆA×«ªðÝÉÀÔ
	//  0 ÆÍnullðÔ·
	//  1 ÌÆ«ÍózñðÔ·
	long[] soinsubunkai(long a) {
		if (a <= 0)
			return null;
		List<Long> list = new ArrayList<Long>();
		if (a % 2 == 0) {
			a /= 2;
			int beki = 1;
			while(a % 2 == 0) {
				a /= 2;
				beki++;
			}
			list.add(2L);
			list.add((long)beki);
		}
		for(long k = 3;; k += 2) {
			if (k * k > a)
				break;
			if (a % k == 0) {
				a /= k;
				int beki = 1;
				while(a % k == 0) {
					a /= k;
					beki++;
				}
				list.add(k);
				list.add((long)beki);
			}
		}
		if (a != 1) {
			list.add(a);
			list.add(1L);
		}
		
		long[] ret = new long[list.size()];
		for(int i = 0; i < list.size(); i++) {
			ret[i] = list.get(i);
		}
		return ret;
	}

	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int[] ir = readIntArray();
		
		int n = ir[0];
		if (n == 0)
			return false;
		
		long[] so = soinsubunkai(n);

		long mul = 1;
		for(int i = 0; i < so.length / 2; i++) {
			long a = so[i * 2];
			long b = so[i * 2 + 1];
			long sum = 1;
			long m = 1;
			for(int j = 0; j < b; j++) {
				m *= a;
				sum += m;
			}
			mul *= sum;
		}
		
		String s;
		if (mul > n * 2) {
			s = "abundant number";
		}
		else if (mul == n * 2) {
			s = "perfect number";
		}
		else  {
			s = "deficient number";
		}
		
		// ðÌ\¦
		System.out.printf("%s\n", s);
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
//			String inputStr = "1,2 4,";
			String inputStr = "28,0,";

			inputStr = inputStr.replace(",", "\n");

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