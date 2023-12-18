import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main{
	static int N;
	static long[][] inf;
	static int[] deai;
	static int[] jyuyo;
	static ArrayList<Integer> nisi=new ArrayList<Integer>();
	static ArrayList<Integer> higasi=new ArrayList<Integer>();
	static long[] higasi_ary;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		N=sc.nextInt();
		long T=sc.nextLong();
		int Q=sc.nextInt();
		long INF=9223372036854775806L;
		long FIN=-9223372036854775806L;
		inf=new long[N][2];
		jyuyo=new int[Q];
		deai=new int[N];
		for(int i=0; i<N; i++) {
			inf[i][0]=sc.nextLong();
			inf[i][1]=sc.nextLong();
			deai[i]=0;
			if(inf[i][1]==2) {
				nisi.add(i);
			}
			else if(inf[i][1]==1) {
				higasi.add(i);
			}
		}
		for(int i=0; i<Q; i++) {
			jyuyo[i]=sc.nextInt()-1;
		}
		higasi_ary=new long[N-nisi.size()];
		for(int i=0; i<N-nisi.size(); i++) {
			higasi_ary[N-nisi.size()-1-i]=0-inf[higasi.get(i)][0];
		}
		for(int i=0; i<N; i++) {	//一番最初に出会う人
			if(inf[i][1]==1) {	//東に歩くなら
				long zahyou=inf[i][0];
				int NS=find_nisi(nisi,zahyou);
				if(NS>=0) {
					deai[i]=nisi.get(NS);
				}
				else {
					deai[i]=-1;
				}
			}
			else if(inf[i][1]==2) {	//西に歩くなら
				int HGS=N-nisi.size()-1-find_higasi(higasi_ary,0-inf[i][0]);
				if(find_higasi(higasi_ary,0-inf[i][0])==-1) {
					deai[i]=-1;
				}
				else if(HGS>=0) {
					deai[i]=higasi.get(HGS);
				}
				else {
					deai[i]=-1;
				}
			}
		}
		for(int i=0; i<Q; i++) {
			int tmp=jyuyo[i];
			if(inf[tmp][1]==1) {//東
				if(deai[tmp]==-1) {
					pl(inf[tmp][0]+T);
				}
				else {
					long nsz=inf[deai[tmp]][0];
					long hgz=inf[deai[deai[tmp]]][0];
					long kaiko=(nsz+hgz)/2;
					if(kaiko-inf[tmp][0]>T) {
						pl(inf[tmp][0]+T);
					}
					else {
						pl(kaiko);
					}
				}
			}
			else if(inf[tmp][1]==2) {//西
				if(deai[tmp]==-1) {
					pl(inf[tmp][0]-T);
				}
				else {
					long nsz=inf[deai[tmp]][0];
					long hgz=inf[deai[deai[tmp]]][0];
					long kaiko=(nsz+hgz)/2;
					if(inf[tmp][0]-kaiko>T) {
						pl(inf[tmp][0]-T);
					}
					else {
						pl(kaiko);
					}
				}
			}
		}
	}

	public static final int find_nisi(ArrayList<Integer> arr, final long value) {
		int low = 0;
		int high = arr.size();
		int mid;
		while (low < high) {
			mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
			if (inf[arr.get(mid)][0] <= value) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if(low<arr.size()) {
			return low;
		}
		else {
			return -1;
		}
	}
	public static final int find_higasi(long[] arr, final long value) {
		int low = 0;
		int high =arr.length;
		int mid;
		while (low < high) {
			mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
			if (arr[mid] <= value) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if(low<arr.length) {
			return low;
		}
		else {
			return -1;
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
}
