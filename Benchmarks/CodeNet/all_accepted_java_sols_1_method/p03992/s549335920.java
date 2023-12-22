import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		byte[] first = new byte[4];
		byte[] last = new byte[8];
		System.in.read(first, 0, 4);
		System.in.read(last, 0, 8);
		System.in.close();
		String strFirst = new String(first);
		String strLast = new String(last);
		String str = strFirst + " " + strLast;
		System.out.println(str);
	}
}

