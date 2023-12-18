import java.io.*;
import java.util.*;

import javax.lang.model.element.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
		solutionD(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solutionA(String[] args) throws Exception{

		int N = nextInt();
		N=N%10;
		if(N==2||N==4||N==5||N==7||N==9){
			pw.println("hon");
		}else if(N==0||N==1||N==6||N==8){
			pw.println("pon");
		}else{
			pw.println("bon");
		}


	}
	public static void solutionB(String[] args) throws Exception{

		int K=nextInt();
		String S = nextString();
		if(S.length()<=K){
			pw.println(S);
		}else{
			pw.println(S.substring(0,K)+"...");
		}


	}

	public static void solutionC(String[] args) throws Exception{

		int A = nextInt();
		int B = nextInt();
		int H = nextInt();
		int M = nextInt();

		double r = clockAngle(H,M);
		System.out.printf("%.12f\n",Math.sqrt(A*A+B*B-2*A*B*Math.cos(Math.toRadians(r))));
	}
	public static void solutionD(String[] args) throws Exception{

		int N = nextInt();
		int M = nextInt();
		int[] ans = new int[N+1];
		ArrayList<Integer>[] list = new ArrayList[N+1];
		for(int i=0;i<list.length;i++){
			list[i]=new ArrayList<>();
		}
		for(int i=0;i<M;i++){
			int A = nextInt();
			int B = nextInt();
			list[A].add(B);
			list[B].add(A);
		}

		Arrays.fill(ans, -1);
		bfs(list,ans);

		pw.println("Yes");
		for(int i=2;i<ans.length;i++){
			pw.println(ans[i]);
		}
	}

	public static void bfs(ArrayList<Integer>[] list , int[] ans ){
		ArrayDeque<Integer> que = new ArrayDeque<>();
		que.add(1);
		ans[1]=1;
		while(que.size()!=0){
			int now  = que.poll();

			for(int x:list[now]){
				if(ans[x]==-1){
					ans[x]=now;
					que.add(x);
				}
			}
		}

	}
	public static double clockAngle(int H , int M){
		double x=30*(H%12)+0.5*M;
		double y=6*M;

		//内角の角度
		return  Math.min(1.0*Math.abs(x-y),1.0*Math.abs(360-Math.abs(x-y)));

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

