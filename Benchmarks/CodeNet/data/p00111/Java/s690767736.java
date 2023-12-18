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
			boolean	lp  = true;
			int		len = stdin.length();
			String	cnv = "";
			String	out = "";

			for(int l = 0; l < len; l++) {
				cnv += cv.enc.get(stdin.substring(l, l+1));
			}

			while (lp) {
				boolean	bs = false;
				for (String key : cv.dec.keySet()) {
					if (cnv.startsWith(key)) {
						out += cv.dec.get(key);
						cnv  = cnv.substring(key.length(), cnv.length());
						bs   = true;
						break;
					}
				}
				lp = bs;
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

class MyConv {
	public	HashMap<String, String>	enc = null;
	public	HashMap<String, String>	dec = null;

	public MyConv() {
		enc = new HashMap<String, String>();
		if (enc != null) {
			enc.put("A", "00000");
			enc.put("B", "00001");
			enc.put("C", "00010");
			enc.put("D", "00011");
			enc.put("E", "00100");
			enc.put("F", "00101");
			enc.put("G", "00110");
			enc.put("H", "00111");
			enc.put("I", "01000");
			enc.put("J", "01001");
			enc.put("K", "01010");
			enc.put("L", "01011");
			enc.put("M", "01100");
			enc.put("N", "01101");
			enc.put("O", "01110");
			enc.put("P", "01111");
			enc.put("Q", "10000");
			enc.put("R", "10001");
			enc.put("S", "10010");
			enc.put("T", "10011");
			enc.put("U", "10100");
			enc.put("V", "10101");
			enc.put("W", "10110");
			enc.put("X", "10111");
			enc.put("Y", "11000");
			enc.put("Z", "11001");
			enc.put(" ", "11010");
			enc.put(".", "11011");
			enc.put(",", "11100");
			enc.put("-", "11101");
			enc.put("'", "11110");
			enc.put("?", "11111");
		}

		dec = new HashMap<String, String>();
		if (dec != null) {
			dec.put("101", " ");
			dec.put("000000", "'");
			dec.put("000011", ",");
			dec.put("10010001", "-");
			dec.put("010001", ".");
			dec.put("000001", "?");
			dec.put("100101", "A");
			dec.put("10011010", "B");
			dec.put("0101", "C");
			dec.put("0001", "D");
			dec.put("110", "E");
			dec.put("01001", "F");
			dec.put("10011011", "G");
			dec.put("010000", "H");
			dec.put("0111", "I");
			dec.put("10011000", "J");
			dec.put("0110", "K");
			dec.put("00100", "L");
			dec.put("10011001", "M");
			dec.put("10011110", "N");
			dec.put("00101", "O");
			dec.put("111", "P");
			dec.put("10011111", "Q");
			dec.put("1000", "R");
			dec.put("00110", "S");
			dec.put("00111", "T");
			dec.put("10011100", "U");
			dec.put("10011101", "V");
			dec.put("000010", "W");
			dec.put("10010010", "X");
			dec.put("10010011", "Y");
			dec.put("10010000", "Z");
		}
	}
}