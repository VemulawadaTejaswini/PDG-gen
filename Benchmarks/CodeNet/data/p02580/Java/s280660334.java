import java.io.*;
import java.math.*;
import java.util.*;
import java.util.regex.*;


public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
//		solveA(args);
//		solveB(args);
//		solveC(args);
//		solveD(args);
		solveE(args);
//		solveF(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solveA(String[] args) throws Exception{
		int N= nextInt();
		int X= nextInt();
		int T= nextInt();
		pw.println(((N+X-1)/X)*T);
	}
	public static void solveB(String[] args) throws Exception{
		String N = nextString();
		int sum =0;
		for(int i=0;i<N.length();i++) {
			sum+=N.charAt(i)-'0';
		}
		if(sum%9==00) {
			pw.println("Yes");
		}else {
			pw.println("No");
		}
	}
	public static void solveC(String[] args) throws Exception{
		int N = nextInt();
		long[] A = nextLongs();

		long ans = 0;
		for(int i=1;i<N;i++) {
			if(A[i-1]>A[i]) {
				ans+=A[i-1]-A[i];
				A[i]=A[i-1];
			}
		}

		pw.println(ans);
	}

	public static void solveD(String[] args) throws Exception{
		int H = nextInt();
		int W = nextInt();
		int Ch = nextInt()+1;
		int Cw = nextInt()+1;
		int Dh = nextInt()+1;
		int Dw = nextInt()+1;
		char[][] m = new char[H+4][W+4];
		Arrays.fill(m[0],'#');
		Arrays.fill(m[1],'#');
		Arrays.fill(m[m.length-2],'#');
		Arrays.fill(m[m.length-1],'#');
		for(int i=0;i<H;i++) {
			m[i+2]=("##"+nextString()+"##").toCharArray();
		}
		int[][] cost = new int[H+4][W+4];
		for(int i=0;i<cost.length;i++) {
			Arrays.fill(cost[i],-1);
		}

		ArrayDeque<int[]> queOver = new ArrayDeque<>();
		queOver.add(new int[] {Ch,Cw});

		cost[Ch][Cw]=0;
		//4方向の場合はx[i+around[n]][k+around[n+1]]n<4,8方向はn<8でループ
		int[] around = { -1, 0, 1, 0, -1, 1, 1, -1, -1 };

		while(!queOver.isEmpty()) {
			ArrayDeque<int[]> que = new ArrayDeque<>();
			que.add(queOver.poll());
			while(!que.isEmpty()) {
				int[] now = que.poll();
//				pw.println(now[0]+":"+now[1]);
				for(int i=0;i<4;i++) {
					int y = now[0]+around[i];
					int x = now[1]+around[i+1];
					if(m[y][x]=='.'&&(cost[y][x]==-1||cost[y][x] >cost[now[0]][now[1]])) {
						cost[y][x]=cost[now[0]][now[1]];
						que.offer(new int[] {y,x});
					}
				}
				for(int k=-2;k<3;k++) {
					for(int i=-2;i<3;i++) {
						int y = now[0]+k;
						int x = now[1]+i;
						if(m[y][x]=='.'&&(cost[y][x]==-1 || cost[y][x] > cost[now[0]][now[1]]+1)) {
							cost[y][x]=cost[now[0]][now[1]]+1;
							queOver.offer(new int[] {y,x});
						}
					}
				}
			}
		}
		pw.println(cost[Dh][Dw]);

	}


	public static void solveE(String[] args) throws Exception{
		int H = nextInt();
		int W = nextInt();
		int M = nextInt();
		HashMap<String,Boolean> map = new HashMap<>();

		int[] Y = new int[H];
		int[] X = new int[W];
		int maxY=0;
		int maxX=0;
		for(int i=0;i<M;i++) {
			int y=nextInt()-1;
			int x=nextInt()-1;
			map.put(y+":"+x,true);
			Y[y]++;
			X[x]++;
		}
		ArrayList<Integer> listY = new ArrayList<Integer>();
		for(int i=0;i<H;i++) {
			if(Y[i]>Y[maxY]) {
				maxY=i;
				listY= new ArrayList<Integer>();
				listY.add(i);
			}else if(Y[i]==Y[maxY]) {
				listY.add(i);
			}
		}
		ArrayList<Integer> listX = new ArrayList<>();
		for(int i=0;i<W;i++) {
			if(X[i]>X[maxX]) {
				maxX=i;
				listX= new ArrayList<Integer>();
				listX.add(i);
			}else if(X[i]==X[maxX]) {
				listX.add(i);
			}
		}
		int ans = Y[listY.get(0)]+X[listX.get(0)];

		for(int y=0;y<listY.size();y++) {
			for(int x=0;x<listX.size();x++) {
				if(!map.containsKey(listY.get(y)+":"+listX.get(x))) {
					pw.println(ans);
					return;
				}
			}
		}
		pw.println(ans-1);

	}

	public static void solveF(String[] args) throws Exception{

	}

	public static void check() throws Exception{
		if(in == null){
			in = new BufferedReader(new InputStreamReader(System.in));
		}
		if(Ws==null || Ws.length<=wsIndx){
			Ws = in.readLine().split(" ");
			wsIndx=0;
		}
	}
	public static int nextInt()throws Exception{
		check();
		return Integer.parseInt(Ws[wsIndx++]);
	}

	public static long nextLong()throws Exception{
		check();
		return Long.parseLong(Ws[wsIndx++]);
	}

	public static String nextString()throws Exception{
		check();
		return Ws[wsIndx++];
	}

	public static int[] nextInts()throws Exception{
		check();
		int[] tmp = new int[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Integer.parseInt(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static long[] nextLongs()throws Exception{
		check();
		long[] tmp = new long[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Long.parseLong(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static String[] nextStrings()throws Exception{
		check();
		wsIndx=Ws.length;
		return Ws;
	}

}

