import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int W=sc.nextInt();
		int H=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		double ans=((double)H*W)/2;
		//当然だが、二等分線が中心を通るときに対称性が生まれる（それ以外はない）（ただし、通らないといけない点のX、Yのざひょうが中心に一致するとない）
		if(2*x==W && 2*y==H) {//通らないといけないのが中心
			pl(ans+" "+1);
		}
		else if(W*y==x*H || W*(H-y)==(W-x)*H|| x*2==W || y*2==H) {//通らないといけないのが中心以外の対称軸上
			pl(ans+" "+0);
		}
		else {
			double difx=Math.abs((double)W/2-((double)x));
			double dify=Math.abs((double)H/2-((double)y));
			if(((double)W/2)-((double)H/2)/dify*difx<0) {
				if(((double)H/2)-((double)W/2)/difx*dify<0) {
					pl(ans+" "+0);
				}
				else {
					pl(ans+" "+0);
				}
			}
			else if(((double)W/2)-((double)H/2)/dify*difx>=0) {
				if(((double)H/2)-((double)W/2)/difx*dify<0) {
					pl(ans+" "+0);
				}
				else {
						pl(ans+" "+1);
				}
			}
		}
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
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
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}