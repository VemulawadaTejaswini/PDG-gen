import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
	HashMap<String,Integer> map;
	int[] d = {1,-1,4,-4};
	public void solve() {
		Queue<String> q = new ArrayDeque<String>();
		map = new HashMap<String,Integer>();
		map.put("01234567", 0);
		q.add("01234567");
		while(q.size() > 0){
			String x = q.poll();
			int index = x.indexOf("0");
			for(int i = 0;i < 4;i++){
				int z = index + d[i];
				if(i == 1 && index % 4 == 0)continue;
				if(i == 0 && index % 4 == 3)continue;
				if(z < 0 || z >= 8)continue;
				char[] ch = x.toCharArray();
				char tmp1 = ch[index];
				ch[index] = ch[z];
				ch[z] = tmp1;
				String s = String.valueOf(ch);
				if(map.containsKey(s))continue;
				map.put(s,map.get(x) + 1);
				q.add(s);
			}
		}
		while(hasNext()){
			StringBuilder sb = new StringBuilder();
			for(int i = 0;i < 8;i++){
				sb.append(next());
			}
			out.println(map.get(sb.toString()));
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