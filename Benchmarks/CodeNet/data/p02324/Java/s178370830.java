import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner();
		PrintWriter pwriter = new PrintWriter(System.out);

		int vn = scan.nextInt();
		int en = scan.nextInt();

		Travel t = new Travel(vn, en, debug);

		for (int i = 0; i < en; i++)
			t.addRoot(i, scan.nextInt(), scan.nextInt(), scan.nextInt());

		pwriter.println(t.getDistance());

		pwriter.flush();
		scan.close();
		System.exit(0);
	}
}

class Travel {
	boolean debug;
	boolean[] isOdd; // if vertices have odd edges then true
	int[][] distance;
	int totalDistance;

	public Travel(int vn, int en, boolean debug) {
		this.debug = debug;

		isOdd = new boolean[vn];

		distance = new int[vn][vn];
		for (int s = 0; s < vn; s++)
			for (int t = 0; t < vn; t++)
				if (s == t)
					distance[s][t] = 0;
				else
					distance[s][t] = -1;
	}

	public void addRoot(int i, int s, int t, int d) {
		totalDistance += d;
		isOdd[s] ^= true; // set vertices s to odd or even, and also t
		isOdd[t] ^= true;
		setLeastRoot(s, t, d);
		setLeastRoot(t, s, d);
	}

	private void setLeastRoot(int s, int t, int d) {
		// set distance to all possible roots
		for (int ss = 0; ss < distance.length; ss++)
			if (distance[ss][s] != -1)
				for (int tt = 0; tt < distance.length; tt++)
					if (distance[t][tt] != -1)
						setRoot(ss, tt, distance[ss][s] + d + distance[t][tt]);
	}

	private void setRoot(int s, int t, int d) {
		if (s == t)
			return;
		if (distance[s][t] == -1 || distance[s][t] > d)
			distance[s][t] = d;
	}

	public int getDistance() {
		return totalDistance + getOddDistance();
	}

	private int getOddDistance() {
		// set additional root to join the odd vertices
		// the root is selected as least distance
		for (int s = 0; s < isOdd.length; s++)
			if (isOdd[s]) {
				int additionalDistance = Integer.MAX_VALUE;
				// if remaining the odd vertices, there are one or more other
				// odd vertices
				for (int t = s + 1; t < isOdd.length; t++)
					if (isOdd[t]) {
						isOdd[s] = false;
						isOdd[t] = false;
						if (debug)
							System.out.println("s\t" + s + "\tt\t" + t + "\td\t" + distance[s][t]);
						additionalDistance = Math.min(additionalDistance, distance[s][t] + getOddDistance());
						isOdd[s] = true;
						isOdd[t] = true;
					}
				return additionalDistance;
			}
		return 0;
	}

}

class UserScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean read() throws IOException {
		ptr = 0;
		buflen = in.read(buffer);
		if (buflen <= 0)
			return false;
		else
			return true;
	}

	private byte getByte() throws IOException {
		if (ptr >= buflen)
			read();
		if (isCtlSpace(buffer[ptr])) {
			return -1;
		} else
			return buffer[ptr++];
	}

	private void skipCtlSpace() throws IOException {
		if (ptr >= buflen)
			read();
		if (isCtlSpace(buffer[ptr])) {
			ptr++;
			skipCtlSpace();
		}
	}

	private boolean isCtlSpace(byte b) {
		if (b <= ' ' || b > '~')
			return true;
		else
			return false;
	}

	public void close() throws IOException {
		in.close();
	}

	public String next() throws IOException {
		skipCtlSpace();
		StringBuilder sb = new StringBuilder();
		byte b;
		while ((b = getByte()) != -1) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() throws IOException {
		skipCtlSpace();
		int n = 0;
		boolean minus = false;
		byte b;
		while ((b = getByte()) != -1) {
			if (b == '-')
				minus = true;
			else {
				n *= 10;
				n += (b - '0');
			}
		}
		if (minus)
			return n * -1;
		else
			return n;
	}
}