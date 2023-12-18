import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main implements Runnable{
	int N;
	int[] S;

	public void solve() {
		N = nextInt();
		S = new int[N];
		for(int i = 0;i < N;i++){
			S[i] = nextInt();
		}
		ArrayList<Integer> ks = new ArrayList<Integer>();
		for(int k = 1;k <= N;k++){
			if(N % k == 0){
				ks.add(k);
			}
		}
		int ans = 1;
		for(int k : ks){
			int t = N / k;
			boolean f = true;
			for(int i = 0;i < k;i++){
				boolean flag = true;
				int j = 0;
				while(t * j + i < N){
					if(S[t * j + i] != S[i]){
						flag = false;
						break;
					}
					j++;
				}

				if(!flag){
					f = false;
					break;
				}
			}

			if(f){
				ans = Math.max(ans, k);
			}
		}
		out.println(ans);
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