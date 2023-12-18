import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
	int t;
	String num;
	int ans;
	boolean rejected;
	ArrayList<String> digit,ansDigit;
	public void dfs(String s,int begin){

		if(begin == s.length()){

			int sum = 0;

			for(String d : digit){
				sum += Integer.parseInt(d);
			}

			if(Math.abs(t - sum) <= Math.abs(t - ans) && sum <= t){

				if(Math.abs(t - sum) == Math.abs(t - ans)){
					rejected = true;
				}else{
					rejected = false;
					ans = sum;
				}
				ansDigit.clear();
				ansDigit.addAll(digit);
			}

		}

		for(int i = begin + 1;i <= s.length();i++){
			digit.add(s.substring(begin,i));
			dfs(s,i);
			digit.remove(digit.size() - 1);
		}
	}



	public void solve() {

		while(true){
			t = nextInt();
			num = next();

			if(t == 0 && num.equals("0"))break;
			digit = new ArrayList<String>();
			ansDigit = new ArrayList<String>();
			ans = (int)1e9 + 7;

			dfs(num,0);

			if(ans > t){
				out.println("error");
			}else if(rejected){
				out.println("rejected");
			}else{
				out.print(ans);
				for(String d : ansDigit){
					out.print(" ");
					out.print(d);
				}
				out.println();
			}
		}
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