import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
	int N;
	String S;
	int[] a;
	@SuppressWarnings("unchecked")
	public void solve() {
		N = nextInt();
		S = next();
		a = new int[26];

		for(int i = 0;i < N;i++){
			if(S.charAt(i) >= 'a' && S.charAt(i) <= 'z')
				a[S.charAt(i)-'a']++;
		}

		ArrayList<Integer>[] list = new ArrayList[10];
		for(int i = 0;i < 10;i++){
			list[i] = new ArrayList<Integer>();
		}

		for(int i = 0;i < 26;i++){
			if(a[i] == 0)continue;
			for(int j = 9;j >= 1;j--){
				if(a[i]%j==0){
					list[j].add(i);
					break;
				}
			}
		}

		int ans = list[1].size() > 0 ? (list[1].size() - 1)* 2 + 1 : 0;

		for(int i = 2;i < 10;i++){

			if(list[i].size() >= 2){
				if(ans == 0)ans += (list[i].size() -1) * 2 + 1 + 4;
				else ans += (list[i].size() -1) * 2 + 4 + 1 + 1;
			}else if(list[i].size() == 1){
				if(ans == 0)ans += 3;
				else ans += 4;
			}
		}

		out.println(ans);
	}
	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
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
}