import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	List<Integer> sosuSet = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		makeSosuList();
		int n = fs.nextInt();
		int[] aArr = fs.nextIntArr(n);
		List<Set<Integer>> soinsuSetList = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			soinsuSetList.add(new HashSet<>());
		}
		
		soinsuSetList.get(n-1).addAll(getSoinsuSet(aArr[n-1]));
		for(int i = n-2; i >= 0; i--) {
			soinsuSetList.get(i).addAll(soinsuSetList.get(i+1));
			soinsuSetList.get(i).addAll(getSoinsuSet(aArr[i]));
		}
		
		
		boolean pairWise = true;
		for(int i = 0; i < n-1; i++) {
			Set<Integer> ithSoinSuSet = getSoinsuSet(aArr[i]);
			Set<Integer> soinsuSet = soinsuSetList.get(i+1);
			
			if(hasInterSection(ithSoinSuSet, soinsuSet)) {
				pairWise = false;
				break;
			}
		}
		
		if(pairWise) {
			System.out.println("pairwise coprime");
			return;
		}
		
		int allGcd = gcd(aArr[n-2], aArr[n-1]);
		for(int i = n-3; i >= 0; i--) {
			allGcd = gcd(allGcd, aArr[i]);
		}
		if(allGcd == 1) {
			System.out.println("setwise coprime");
			return;
		}
		
		System.out.println("not coprime");
		
		
	}
	
	
	boolean hasInterSection(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> left;
		Set<Integer> right;
		
		if(set1.size() < set2.size()) {
			left = set1;
			right = set2;
		}else {
			left = set2;
			right = set1;
		}
		
		for(Integer val : left) {
			if(right.contains(val)) {
				return true;
			}
		}
		
		return false;
	}
	
	
	void makeSosuList() {
		int maxVal = 1_000_000_1;
		int[] arr = new int[maxVal];
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = 2; i < maxVal; i++) {
			if(arr[i] == 1) {
				continue;
			}
			
			for(int j = 2; j*i < maxVal; j++) {
				arr[j*i] = 1;
			}
		}
		for(int i = 2; i < maxVal; i++) {
			if(arr[i] == 0) {
				sosuSet.add(i);
			}
		}
	}
	
	public Set<Integer> getSoinsuSet(int val){
		Set<Integer> retSet = new HashSet<>();
		for(Integer sosu : sosuSet) {
			if(val % sosu == 0) {
				retSet.add(sosu);
				while(val % sosu == 0) {
					val /= sosu;
				}
			}
		}
		
		return retSet;
	}

	public int gcd(int a, int b) {
		if (a < b) {
			int swap = a;
			a = b;
			b = swap;
		}
		int r = a % b;
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
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
