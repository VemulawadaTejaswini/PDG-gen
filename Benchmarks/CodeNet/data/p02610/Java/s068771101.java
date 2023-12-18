import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int t = fs.nextInt();
		
		Comparator<Rakuda> rakudaComparator = Comparator.comparing(Rakuda::getdiff).reversed();
		
		for(int z = 0; z < t; z++) {
			
			int n = fs.nextInt();
			ArrayList<Rakuda> rakudaList = new ArrayList<>(n);
			for(int i = 0; i < n; i++) {
				int k = fs.nextInt()-1;
				int l = fs.nextInt();
				int r = fs.nextInt();
				rakudaList.add(new Rakuda(k,l,r));
			}
			
			rakudaList.sort(rakudaComparator);
			ArrayList<Rakuda> smallerMatch = new ArrayList<>();
			ArrayList<Rakuda> biggerMatch = new ArrayList<>();
			
			int[] umaru = new int[n];
			for(Rakuda rakuda : rakudaList) {
				
				
				int index = -1;
				if(rakuda.l < rakuda.r) {
					
					for(int i = rakuda.k + 1; i < n; i++) {
						if(umaru[i] == 0) {
							index = i;
							umaru[i] = 1;
							break;
						}
					}
				}else {
					for(int i = rakuda.k; i >= 0; i--) {
						if(umaru[i] == 0) {
							index = i;
							umaru[i] = 1;
							break;
						}
					}
				}
				
				if(index == -1) {
					smallerMatch.add(rakuda);
				}else {
					biggerMatch.add(rakuda);
				}
			}
			
			long ans = 0;
			for(Rakuda rakuda : smallerMatch) {
				if(rakuda.l < rakuda.r) {
					ans += rakuda.l;
				}else {
					ans += rakuda.r;
				}
			}
			for(Rakuda rakuda : biggerMatch) {
				if(rakuda.l < rakuda.r) {
					ans += rakuda.r;
				}else {
					ans += rakuda.l;
				}
			}
			
			System.out.println(ans);
		}
	}
	
	class Rakuda {
		int k;
		int l;
		int r;
		int diff;
		
		Rakuda(int k, int l, int r) {
			this.k = k;
			this.l = l;
			this.r = r;
			this.diff = Math.abs(l-r);
		}
		
		int getdiff() {
			return diff;
		}
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
