import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main implements Runnable{
	String S;
	int N;
	HashSet<String> set;

	public void dfs(String s,int a,int b,int c){

		if(s.length() > N)return;

		if(set.contains(s))return;
		set.add(s);

		if(s.length() + 2 * a <= N)dfs(s.replaceAll("A", "ABC"),a,b + a,c + a);
		if(s.length() + 2 * b <= N)dfs(s.replaceAll("B", "ABC"),a + b,b,c + b);
		if(s.length() + 2 * c <= N)dfs(s.replaceAll("C", "ABC"),a + c,b + c,c);

		return;
	}

	public void solve() {
		S = next();
		N = S.length();

		set = new HashSet<String>();

		dfs("ABC",1,1,1);
		out.println(set.contains(S) ? "Yes" : "No");
	}

	public static void main(String[] args) {
		new Thread(null,new Main(),"",32 * 1024 * 1024).start();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	@Override
	public void run() {
		out.flush();
		new Main().solve();
		out.close();

	}
}