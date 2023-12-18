import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main implements Runnable{
	String S;
	int N,A,B,C;
	HashSet<String> set;
	public boolean dfs(String s,int a,int b,int c){

		if(s.equals(S))return true;
		if(set.contains(s))return false;
		//System.err.println(s);
		{
			StringBuilder sb = new StringBuilder();
			int nb = 0,nc = 0;
			for(int i = 0;i < s.length();i++){
				if(s.charAt(i)=='A'){
					sb.append("ABC");
					nb++;
					nc++;
				}else{
					sb.append(s.charAt(i));
				}
			}

			if((nb>0&&nc>0)&&a<=A&&b+nb<=B&&c+nc<=C&&sb.length()<=S.length()){
				if(dfs(sb.toString(),a,b+nb,c+nc))return true;
			}
		}

		{
			StringBuilder sb = new StringBuilder();
			int na = 0,nc = 0;
			for(int i = 0;i < s.length();i++){
				if(s.charAt(i)=='B'){
					sb.append("ABC");
					na++;
					nc++;
				}else{
					sb.append(s.charAt(i));
				}
			}

			if((na>0||nc>0)&&a+na<=A&&b<=B&&c+nc<=C&&sb.length()<=S.length()){
				if(dfs(sb.toString(),a+na,b,c+nc))return true;
			}
		}

		{
			StringBuilder sb = new StringBuilder();
			int na = 0,nb = 0;
			for(int i = 0;i < s.length();i++){
				if(s.charAt(i)=='C'){
					sb.append("ABC");
					na++;
					nb++;
				}else{
					sb.append(s.charAt(i));
				}
			}

			if((na>0||nb>0)&&a+na<=A&&b+nb<=B&&c<=C&&sb.length()<=S.length()){
				if(dfs(sb.toString(),a+na,b+nb,c))return true;
			}
		}
		set.add(s);
		return false;

	}

	public void solve() {
		S = next();
		N = S.length();
		for(int i = 0;i < N;i++){
			if(S.charAt(i) == 'A')A++;
			if(S.charAt(i) == 'B')B++;
			if(S.charAt(i) == 'C')C++;
		}
		set = new HashSet<String>();
		/*ArrayDeque<String> q = new ArrayDeque<String>();
		HashSet<String> set = new HashSet<String>();
		boolean find = false;
		q.add(S);
		while(q.size() > 0){
			String s = q.poll();

			if(s.equals("ABC")){
				find = true;
				break;
			}

			if(set.contains(s))continue;

			int a = 0,b = 0,c = 0;
			for(int i = 0;i < s.length();i++){
				if(s.charAt(i)=='A')a++;
				if(s.charAt(i)=='B')b++;
				if(s.charAt(i)=='C')c++;
			}

			{
				StringBuilder sb = new StringBuilder();
				int na = a,nb = b,nc = c;
				for(int i = 0;i < s.length();i++){
					if(i + 2 < s.length() && s.charAt(i)=='A'&&s.charAt(i+1)=='B'&&s.charAt(i+2)=='C'){
						sb.append("A");
						nb--;
						nc--;
						i+=2;
					}else{
						sb.append(s.charAt(i));
					}
				}

				if((a!=na||b!=nb||c!=nc) && sb.length() >= 3 && a > 0 && b > 0 && c > 0){
					q.add(sb.toString());
					out.println(sb);
				}
			}

			{
				StringBuilder sb = new StringBuilder();
				int na = a,nb = b,nc = c;
				for(int i = 0;i < s.length();i++){
					if(i + 2 < s.length() && s.charAt(i)=='A'&&s.charAt(i+1)=='B'&&s.charAt(i+2)=='C'){
						sb.append("B");
						na--;
						nc--;
						i+=2;
					}else{
						sb.append(s.charAt(i));
					}
				}

				if((a!=na||b!=nb||c!=nc) && sb.length() >= 3 && a > 0 && b > 0 && c > 0){
					q.add(sb.toString());
					out.println(sb);
				}
			}

			{
				StringBuilder sb = new StringBuilder();
				int na = a,nb = b,nc = c;
				for(int i = 0;i < s.length();i++){
					if(i + 2 < s.length() && s.charAt(i)=='A'&&s.charAt(i+1)=='B'&&s.charAt(i+2)=='C'){
						sb.append("C");
						na--;
						nb--;
						i+=2;
					}else{
						sb.append(s.charAt(i));
					}
				}

				if((a!=na||b!=nb||c!=nc) && sb.length() >= 3 && a > 0 && b > 0 && c > 0){
					q.add(sb.toString());
					out.println(sb);
				}
			}

			set.add(s);
		}*/

		if(dfs("ABC",1,1,1))out.println("Yes");
		else out.println("No");
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