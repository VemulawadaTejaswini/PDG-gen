import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main implements Runnable{
	int N;
	int[] c = new int[111];
	int[] a = new int[26];
	public void solve() {
		while((N=nextInt())!=0){

			for(int i = 0;i < N;i++)c[i] = next().charAt(0)-'A';
			Arrays.fill(a, 0);
			boolean flag = true;
			for(int i = 0;i < N;i++){
				a[c[i]]++;
				int max = -1;
				boolean f = false;
				for(int j = 0;j < 26;j++)if(max == -1 || a[max] < a[j])max = j;
				for(int j = 0;j < 26;j++){
					if(max != j){
						f |= a[max] <= a[j]+N-i-1;
					}
				}

				if(!f){
					out.println((char)(max+'A') + " " + (i+1));
					flag = false;
					break;
				}
			}
			if(flag)out.println("TIE");
		}
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