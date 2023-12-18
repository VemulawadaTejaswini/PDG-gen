import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int n = fs.nextInt();
		String s = fs.next();
		int[] bitArr = new int[n];
		
		int bitNum = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '0') {
				bitArr[i] = 0;
			}else {
				bitArr[i] = 1;
				bitNum++;
			}
		}
		
		int[][] modArr = new int[n][3];
		for(int i = 0; i < 3; i++) {
			int val = bitNum + i -1;
			if(val <= 0) {
				continue;
			}
			
			
			modArr[n-1][i] = 1 % val;
			for(int j = 1; j < n; j++) {
				modArr[n-j-1][i] = (modArr[n-j][i] * 2) % val;
			}
		}
		
		int[] cumModArr = new int[3];
		for(int i = 0; i < 3; i++) {
			int val = bitNum + i -1;
			if(val <= 0) {
				continue;
			}
			
			int mod = 0;
			for(int j = 0; j < n; j++) {
				if(bitArr[j] == 1) {
					mod = (mod + modArr[j][i]) % val;
				}
			}
			
			cumModArr[i] = mod;
		}
		
		System.out.println(Arrays.toString(cumModArr));
		
		
		for(int i = 0; i < n; i++) {
			
			if(bitArr[i] == 0) {
				int mod = bitNum+1;
				int cumMod = cumModArr[2];
				cumMod = (cumMod + modArr[i][2]) % mod;
				System.out.println(recursive(cumMod) + 1);
			}else {
				
				int mod = bitNum-1;
				if(mod == 0) {
					System.out.println(0);
					continue;
				}
				
				int cumMod = cumModArr[0];
				if(cumMod < modArr[i][0]) {
					cumMod = (mod + cumMod - modArr[i][0]) % mod;
				}else {
					cumMod = (cumMod -  modArr[i][0]) % mod;
				}
				
				System.out.println(recursive(cumMod)+1);
			}
		}
	}
	
	int recursive(int n) {
		
		int cnt = 0;
		while(n > 0) {
			cnt++;
			n = n % getBitNum(n);
		}
		
		return cnt;
	}
	
	int getBitNum(int n) {
		
		int ans = 0;
		while(n > 0) {
			
			if((n & 1) == 1) {
				ans++;
			}
			n = n >> 1;
		}
		return ans;
	}

	

	public class FastScanner {

		BufferedReader reader;
		private StringTokenizer st;

		public FastScanner() {
			st = null;
			reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() throws IOException {
			if (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(reader.readLine());
			}
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			st = null;
			String readLine = null;
			readLine = reader.readLine();
			return readLine;
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArr(int n) throws NumberFormatException, IOException {
			int[] retArr = new int[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextInt();
			}
			return retArr;
		}

		public long[] nextLongArr(int n) throws NumberFormatException, IOException {
			long[] retArr = new long[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextLong();
			}
			return retArr;
		}

		public void close() throws IOException {
			reader.close();
		}
	}

}
