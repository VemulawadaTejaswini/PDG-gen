
import java.io.*;
import java.util.*;


// 44 27.672
// 46 33.227 240 2011/10/28
// 2011/10/29

// 0105 Book index
public class Main {


	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		Map<String, List<Integer>> map = new TreeMap<String, List<Integer>>();  
		
		for(;;) {
			String line = reader.readLine();
			if (line == null)
				break;
			String[] sp = line.split(" ");
			String word = sp[0];
			int page = Integer.parseInt(sp[1]);
			List<Integer> list = map.get(word);
			if (list == null) {
				list = new ArrayList<Integer>();
				map.put(word, list);
			}
			list.add(page);
		}
		
		for(String word: map.keySet()) {
			List<Integer> list = map.get(word);
			System.out.printf("%s\n", word);
			Collections.sort(list);
			for(int i = 0; i < list.size(); i++) {
				if (i != 0)
					System.out.printf(" ");
				System.out.printf("%d", list.get(i));
			}
			System.out.printf("\n");
		}
		
		return false;
//		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "style 12:even 253:";
			
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