import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		InputReader in = new InputReader();
		int[] arr = new int[3];
		
		for (int i=0; i<3; i++)
			arr[i] = in.nextInt();
		
		Arrays.sort(arr);
		
		if (isHaiku(arr))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	
	public static boolean isHaiku(int[] arr) {
		int[] haiku = {5, 5, 7};
		for (int i=0; i<3; i++)
			if (arr[i] != haiku[i])
				return false;
		return true;
	}
	
	static class InputReader {
		public BufferedReader br;
		public StringTokenizer st;
		
		public InputReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = null;
		}
		
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}