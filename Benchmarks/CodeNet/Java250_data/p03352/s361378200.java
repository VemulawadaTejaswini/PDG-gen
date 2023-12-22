
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 class Main{

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	static boolean prime[] = new boolean[1001];

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		stones(sc);
		/*
		 * String str =sc.nextLine(); int q=sc.nextInt(); while(q-->0){ int
		 * len=sc.nextInt(); int[] ch=new int[26]; boolean chk=false; for(int
		 * i=0;i<str.length()-len+1;i++){ String sub=str.substring(i, i+len);
		 * System.out.println(sub); boolean p=method(sub); if(p){ chk=true; //
		 * break; } } System.out.println(chk?len:-1);
		 */
	}

	private static void stones(FastReader sc) {
		int x = sc.nextInt(),ans=0;
		int[] aa = { 1, 4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100, 121, 125, 128, 144, 169, 196, 216, 225, 243, 256,
				289, 324, 343, 361, 400, 441, 484, 512, 529, 576, 625, 676, 729, 784, 841, 900, 961, 1000 };
		for(int i=0;i<aa.length;i++){
			if(aa[i]<=x){
				ans=aa[i];
			} else{
				break;
			}
		}
		System.out.println(ans);
	}
}