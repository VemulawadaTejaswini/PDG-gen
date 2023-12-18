import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {

	int H,W;
	int[] DX = {0,0,1,1,1,-1,-1,-1};
	int[] DY = {1,-1,0,1,-1,0,1,-1};
	boolean[][] used;
	char[][] spells;
	HashMap<String,Integer> map;

	public String dfs(int h,int w,int dy,int dx){

		if(used[h][w])return "";
		used[h][w] = true;


		String ret = "";
		int nh = (h + dy + H) % H;
		int nw = (w + dx + W) % W;

		ret = spells[h][w] + dfs(nh,nw,dy,dx);

		used[h][w] = false;
		map.put(ret, map.containsKey(ret)  ? map.get(ret) + 1 : 1);
		return ret;
	}


	public void solve() {
		while(true){
			H = nextInt();
			W = nextInt();
			if(H + W == 0)break;
			map = new HashMap<String,Integer>();
			spells = new char[H][];

			for(int i = 0;i < H;i++){
				spells[i] = next().toCharArray();
			}

			used = new boolean[H][W];

			for(int i = 0;i < H;i++){
				for(int j = 0;j < W;j++){
					for(int k = 0;k < DX.length;k++){
						dfs(i,j,DY[k],DX[k]);
					}
				}
			}

			String ans = "";
			for(String key : map.keySet()){
				if(map.get(key) >= 2 && key.length() >= 2){

					if(ans.length() < key.length()){
						ans = key;
					}else if(ans.length() == key.length() && ans.compareTo(key) == 1){
						ans = key;
					}
				}
			}

			out.println(ans.length() == 0 ? 0 : ans);

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