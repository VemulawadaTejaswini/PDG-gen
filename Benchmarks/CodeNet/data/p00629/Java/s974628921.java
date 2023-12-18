import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			Team[] team = new Team[n];
			for (int i = 0; i < n; i++) {
				team[i] = new Team(
						sc.nextInt(),
						sc.nextInt(),
						sc.nextInt(),
						sc.nextInt());
			}
			Arrays.sort(team);
			
			int total = 0;
			int[] teamNum = new int[1000];
			for (int i = 0; i < n; i++) {
				if (total < 10) {
					if (teamNum[team[i].u] < 3) {
						out.println(team[i].i);
						total++;
						teamNum[team[i].u]++;
					}
				} else if (total < 20) {
					if (teamNum[team[i].u] < 2) {
						out.println(team[i].i);
						total++;
						teamNum[team[i].u]++;
					}
				} else if (total < 26) {
					if (teamNum[team[i].u] < 1) {
						out.println(team[i].i);
						total++;
						teamNum[team[i].u]++;
					}
				} else {
					break;
				}
			}
		}
		out.flush();
	}
	
	static class Team implements Comparable<Team> {
		int i, u, a, p;
		
		public Team(int i, int u, int a, int p) {
			this.i = i;
			this.u = u;
			this.a = a;
			this.p = p;
		}
		
		@Override
		public int compareTo(Team t) {
			if (this.a == t.a) {
				if (this.p == t.p) return this.i - t.i;
				return this.p - t.p;
			}
			return -(this.a - t.a);
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
			if (buflen <= 0) { return false; }
		}
		return true;
	}
	
	private byte readByte() {
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}
	
	private boolean isPrintableChar(int c) {
		return '!' <= c && c <= '~';
	}
	
	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
	}
	
	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}
	
	public int nextInt() {
		if (!hasNext()) { throw new NoSuchElementException(); }
		int n = 0;
		boolean minus = false;
		byte b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) { throw new NumberFormatException(); }
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