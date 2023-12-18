import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main implements Runnable{
	int N,M,X,Y;
	int[] px,py;
	boolean[] used;
	public void solve() {
		N = nextInt();
		M = nextInt();
		X = nextInt();
		Y = nextInt();
		px = new int[N+1];
		py = new int[N+1];
		px[0] = X;
		py[0] = Y;
		for(int i = 1;i <= N;i++){
			px[i] = nextInt();
			py[i] = nextInt();
		}

		double ans = 0.0;
		used = new boolean[N+1];

		double minDis1 = Double.MAX_VALUE;
		int minInd1 = -1;
		for(int i = 1;i <= N;i++){
			double dis = Point2D.distance(px[0], py[0], px[i], py[i]);
			if(dis < minDis1){
				minDis1 = dis;
				minInd1 = i;
			}
		}
		Line2D.Double line = new Line2D.Double(px[0],py[0],px[minInd1],py[minInd1]);
		used[minInd1] = true;
		used[0] = true;
		ans += minDis1;

		for(int i = 0;i < M-1;i++){
			double minDis2 = Double.MAX_VALUE;
			int minInd2 = -1;
			for(int j = 0;j <= N;j++){
				if(used[j])continue;
				double dis = line.ptSegDist(px[j], py[j]);
				if(dis < minDis2){
					minDis2 = dis;
					minInd2 = j;
				}
			}

			double minDis3 = Double.MAX_VALUE;
			int minInd3 = -1;
			for(int j = 0;j <= N;j++){
				if(used[j]){
					double dis = Point2D.distance(px[minInd2], py[minInd2], px[j], py[j]);
					if(dis  < minDis3){
						minDis3 = dis;
						minInd3 = j;
					}
				}
			}
			ans += minDis3;
			used[minInd2] = true;
			line.setLine(px[minInd2], py[minInd2], px[minInd3], py[minInd3]);
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