
import java.io.*;
import java.util.*;


// 2011/10/23

// 0199 ïVÈl½¿ªÀéÖq
public class Main {
	
	
	class Team implements Comparable<Team> {
		String name;
		int win;
		int lose;
		public Team(String name, int win, int lose) {
			this.name = name;
			this.win = win;
			this.lose = lose;
		}
		@Override
		public int compareTo(Team o) {
			if (win != o.win) {
				return -(win - o.win);
			}
			else
				return (lose - o.lose);
		}
		
	}
	

	// C return falseÅ¨µÜ¢
	boolean main() throws IOException {

		int[] ia = readIntArray();
		int n = ia[0];
		int m = ia[1];
		if (n == 0 && m == 0)
			return false;
		
		int[] isu = new int[n];
		
		for(int i = 0; i < m; i++) {
			String s = reader.readLine();
			
			int c = s.charAt(0) - 'A' + 1;

			switch(c) {
			case 1: // A
				for(int j = 0;; j++) {
					if (isu[j] == 0) {
						isu[j] = c;
						break;
					}
				}
				break;
			case 2: // B
				for(int j = n-1;; j--) {
					if (j < 0) {
						for(j = 0;; j++) {
							if (isu[j] == 0) {
								isu[j] = c;
								break;
							}
						}
						break;
					}
					if (isu[j] == 0 && (j == 0 || isu[j - 1] != 1) && (j == n -1|| isu[j + 1] != 1)) {
						isu[j] = c;
						break;
					}
				}
				break;
			case 3: // C
				for(int j = 0;; j++) {
					if (j > n) {
						//lª¢È¢
						int p = n / 2;
						isu[p] = c;
						break;
					}
					if (isu[j] != 0) {
						if (j < n - 1 && isu[j + 1] == 0) {
							isu[j + 1] = c;
							break;
						}
						if (j > 0 && isu[j - 1] == 0) {
							isu[j - 1] = c;
							break;
						}
					}
				}
				break;
			default: // D
			{
				int maxLen = 0;
				int maxPos = 0;
				for(int j = 0; j < n; j++) {
					int k;
					for(k = 0; k < n; k++) {
						if (j + k < n) {
							if (isu[j + k] != 0) {
								break;
							}
						}
						if (j - k >= 0) {
							if (isu[j - k] != 0) {
								break;
							}
						}
					}
					// ±±ÅkÍ£
					if (k > maxLen) {
						maxLen = k;
						maxPos = j;
					}
				}
				isu[maxPos] = c;
				break;
			}
			}
			
		}
		for(int c: isu) {
			char ch;
			if (c == 0) 
				ch = '#';
			else 
				ch = (char)('A' - 1 + c);
					
			System.out.printf("%c", ch);
		}
		System.out.printf("\n");
		
//		System.out.printf("%d\n", sum / size);
		
		return true; // ³íI¹ Ö
	}
	

//	private final static boolean DEBUG = true;  // debug
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG) {
			log = System.out;
			
			String inputStr = "5 4:A:B:C:D:0 0:";

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