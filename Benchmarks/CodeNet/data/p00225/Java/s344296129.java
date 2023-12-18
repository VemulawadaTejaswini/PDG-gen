
import java.io.*;
import java.util.*;


// 2011/10/19

//@0225 ±Ô½Ê«ÂË±
public class Main {

	// æª¶Æö¶Ìªêv
	// ·×ÄªÂÈªÁÄ¢éÅOK
	
	
	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int N = readIntArray()[0];
		if (N == 0) 
			return false; // ¨µÜ¢

		List<String> list = new ArrayList<String>();
		int[] cnt = new int[26]; // At@xbg26¶ªÌJE^
		int[] flag = new int[26]; // æª¶¶ÝtO At@xbg26¶ª
		
		for(int i = 0; i < N; i++) {
			String s = reader.readLine();
			list.add(s);
//			char c1 = s.charAt(0); //æª
//			char c2 = s.charAt(s.length() - 1); //ö
//			cnt[c1 - 'a']++;
//			flag[c1 - 'a'] = 1;
//			cnt[c2 - 'a']--;
		}

		// ·×Ä0ªOK
		boolean dame = false;
//		for(int i = 0; i < cnt.length; i++) {
//			if (cnt[i] != 0) {
//				dame = true;
//				break;
//			}
//		}
//		
//		if (!dame) {
//			// ·×ÄÂÈªÁÄ¢é©
//			String s = list.get(0);
//			char c1 = s.charAt(0); //æª
//			char c2 = s.charAt(s.length() - 1); //ö
//			flag[c1 - 'a'] = 0;
//			for(;;) {
//				boolean modify = false;
//				for(int i = 0; i < list.size(); i++) {
//					s = list.get(i);
//					c1 = s.charAt(0); //æª
//					c2 = s.charAt(s.length() - 1); //ö
//					if (flag[c1 - 'a'] == 0 && flag[c2 - 'a'] != 0) {
//						flag[c2 - 'a'] = 0;
//						modify = true;
//					}
//				}
//				if (!modify)
//					break;
//			}
//			
//			// ·×Ä0ªOK
//			for(int i = 0; i < flag.length; i++) {
//				if (flag[i] != 0) {
//					dame = true;
//					break;
//				}
//			}
//		}
				
		// ðÌ\¦
		System.out.printf("%s\n", dame ? "NG" : "OK");
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
//			String inputStr = "7\nae\nyw\nga\nkg\nel\nwk\nly\n" + "0\n";
			String inputStr = "7\nab\nbc\nca\nde\nef\nfg\ngd\n" + "0\n";

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