import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Main {
	private	static	BufferedReader	br = null;
	private	static	MyConv			cv = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
		cv = new MyConv();
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		String	stdin = null;

		while ((stdin = parseStdin()) != null) {
			int		len = stdin.length();
			String	cnv = "";
			String	out = "";
			String	tmp = null;

			for(int l = 0; l < len; l++) {
				cnv += cv.get(stdin.substring(l, l+1));
			}

			len = cnv.length();
			for(int l = 1, m = 0; l <= len; l++) {
				tmp = cnv.substring(m, l);
				if (cv.containsKey(tmp)) {
					out += cv.get(tmp);
					m = l;
				}
			}

			System.out.println(out);
		}
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
       		stdin = br.readLine();
        }
        catch (IOException e) {}
 
        return stdin;
	}
}

class MyConv extends HashMap<String, String>{
	public MyConv() {
		put("A", "00000");
		put("B", "00001");
		put("C", "00010");
		put("D", "00011");
		put("E", "00100");
		put("F", "00101");
		put("G", "00110");
		put("H", "00111");
		put("I", "01000");
		put("J", "01001");
		put("K", "01010");
		put("L", "01011");
		put("M", "01100");
		put("N", "01101");
		put("O", "01110");
		put("P", "01111");
		put("Q", "10000");
		put("R", "10001");
		put("S", "10010");
		put("T", "10011");
		put("U", "10100");
		put("V", "10101");
		put("W", "10110");
		put("X", "10111");
		put("Y", "11000");
		put("Z", "11001");
		put(" ", "11010");
		put(".", "11011");
		put(",", "11100");
		put("-", "11101");
		put("'", "11110");
		put("?", "11111");
		put("101", " ");
		put("000000", "'");
		put("000011", ",");
		put("10010001", "-");
		put("010001", ".");
		put("000001", "?");
		put("100101", "A");
		put("10011010", "B");
		put("0101", "C");
		put("0001", "D");
		put("110", "E");
		put("01001", "F");
		put("10011011", "G");
		put("010000", "H");
		put("0111", "I");
		put("10011000", "J");
		put("0110", "K");
		put("00100", "L");
		put("10011001", "M");
		put("10011110", "N");
		put("00101", "O");
		put("111", "P");
		put("10011111", "Q");
		put("1000", "R");
		put("00110", "S");
		put("00111", "T");
		put("10011100", "U");
		put("10011101", "V");
		put("000010", "W");
		put("10010010", "X");
		put("10010011", "Y");
		put("10010000", "Z");
	}
}