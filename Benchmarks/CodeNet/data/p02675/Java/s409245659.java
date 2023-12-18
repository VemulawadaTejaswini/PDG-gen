import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		int N = Integer.parseInt(sc.next());
		int num = N % 10;
		String mes = "";

		switch(num) {
		case 0:
			mes = "pon";
			break;
		case 1:
			mes = "pon";
			break;
		case 2:
			mes = "hon";
			break;
		case 3:
			mes = "bon";
			break;
		case 4:
			mes = "hon";
			break;
		case 5:
			mes = "hon";
			break;
		case 6:
			mes = "pon";
			break;
		case 7:
			mes = "hon";
			break;
		case 8:
			mes = "pon";
			break;
		case 9:
			mes = "hon";
			break;
		}

		System.out.print(mes);
	}

}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}else{
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
}