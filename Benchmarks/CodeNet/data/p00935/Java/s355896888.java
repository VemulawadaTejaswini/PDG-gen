import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	FastScanner scanner = new FastScanner();
	int N = scanner.nextInt();
	int[] digit = new int[N];
	for (int i = 0; i < digit.length; i++) {
	    digit[i] = scanner.nextInt();
	}
	String string = "";
	for (int i = 0; i < digit.length; i++) {
	    string = string + String.valueOf(digit[i]);
	}

	final int limd = 4;
	TreeSet<Integer> set = new TreeSet<Integer>();
	for (int i = 0; i < digit.length; i++) {
	    for (int j = 1; j <= limd && i + j <= N; j++) {
		String tString = string.substring(i, i + j);
		set.add(Integer.parseInt(tString));
	    }
	}

	Integer[] array = set.toArray(new Integer[set.size()]);
	for (int i = 0, pos = 0;;) {
	    if (pos < array.length && i == array[pos]) {
		pos++;
		i++;
	    } else {
		System.out.println(i);
		return;
	    }
	}

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
	} else {
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

    private int readByte() {
	if (hasNextByte())
	    return buffer[ptr++];
	else
	    return -1;
    }

    private static boolean isPrintableChar(int c) {
	return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
	while (hasNextByte() && !isPrintableChar(buffer[ptr]))
	    ptr++;
    }

    public int nextInt() {
	return (int) nextLong();
    }

    public boolean hasNext() {
	skipUnprintable();
	return hasNextByte();
    }

    public String next() {
	if (!hasNext())
	    throw new NoSuchElementException();
	StringBuilder sb = new StringBuilder();
	int b = readByte();
	while (isPrintableChar(b)) {
	    sb.appendCodePoint(b);
	    b = readByte();
	}
	return sb.toString();
    }

    public long nextLong() {
	if (!hasNext())
	    throw new NoSuchElementException();
	long n = 0;
	boolean minus = false;
	int b = readByte();
	if (b == '-') {
	    minus = true;
	    b = readByte();
	}
	if (b < '0' || '9' < b) {
	    throw new NumberFormatException();
	}
	while (true) {
	    if ('0' <= b && b <= '9') {
		n *= 10;
		n += b - '0';
	    } else if (b == -1 || !isPrintableChar(b)) {
		return minus ? -n : n;
	    } else {
		throw new NumberFormatException();
	    }
	    b = readByte();
	}
    }
}