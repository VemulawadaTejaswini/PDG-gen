
import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.Math.*;

import java.util.*;


public class Main {

	public static Scanner sc=new Scanner(in);


	static boolean next_permutation(int[]as) {
		int n = as.length;
		for (int i = n - 1; i > 0; i--) {
			if (as[i - 1] < as[i]) {
				int j = n;
				while (as[i - 1] >= as[--j]);
				swap(as, i - 1, j);
				reverse(as, i, n);
				return true;
			}
		}
		return false;
	}
	static void swap(int[] is, int i, int j) {
		int t = is[i];
		is[i] = is[j];
		is[j] = t;
	}
	static void reverse(int[] is, int s, int t) {
		while (s < --t) swap(is, s++, t);
	}

	final static StringBuffer buf;
	static{
		 buf=new StringBuffer();
		for(int i=0;i<200;i++)buf.append("z");
	}

	void run(){
		while(true){
			int _n=sc.nextInt();
			if(_n==0)return;
			List<String> slist=new ArrayList<String>();
			for(int i=0;i<_n;i++)slist.add(sc.next());

			List<String> rlist=new ArrayList<String>();
			for(int i=0;i<_n;i++){
				for(int j=0;j<_n;j++)if(i!=j){
					if(slist.get(i).contains(slist.get(j)))rlist.add(slist.get(j));
				}
			}
			slist.removeAll(rlist);

			int n=slist.size();
			String[] ss=slist.toArray(new String[0]);
			Arrays.sort(ss);

			String[][] suffixes=new String[n][];
			for(int i=0;i<n;i++){
				suffixes[i]=new String[ss[i].length()+1];
				for(int l=0;l<=ss[i].length();l++)suffixes[i][l]=ss[i].substring(0,l);
			}
			String[][] prefixes=new String[n][];
			for(int i=0;i<n;i++){
				prefixes[i]=new String[ss[i].length()+1];
				for(int l=0;l<=ss[i].length();l++)prefixes[i][l]=ss[i].substring(l);
			}

			int[][] dup=new int[n][n];
			for(int i=0;i<n;i++)for(int j=0;j<n;j++){
				sl:for(int l=ss[j].length()-1;l>=0;l--){
					if(ss[i].endsWith(suffixes[j][l])){
						dup[i][j]=l;
						break sl;
					}
				}
			}

			String[][] dp=new String[n][1<<n];
			for(int i=0;i<n;i++)for(int j=0;j<(1<<n);j++){
				dp[i][j]=buf.toString();
			}
			for(int i=0;i<n;i++){
				dp[i][0]="";
			}
			for(int i=0;i<(1<<n);i++){
				for(int j=0;j<n;j++){
					String mv=buf.toString();
					if(((i>>j) & 1) ==0)continue;
					for(int k=0;k<n;k++){
						if(((i>>k) & 1) ==0)continue;
						String tmp=dp[k][i-(1<<j)]+prefixes[j][dup[k][j]];
						if(mv.length()>tmp.length() | mv.compareTo(tmp)>0){
							mv=tmp;
						}
					}
					dp[j][i]=mv;
				}
			}
			String mv=buf.toString();
			for(int i=0;i<n;i++){
				if(mv.compareTo(dp[i][(1<<n)-1])>0){
					mv=dp[i][(1<<n)-1];
				}
			}
			ln(mv);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

	//output lib
	public static void ln(){
		out.println();
	}
	public static void pr(Object obj){
		out.print(str(obj));
	}
	public static void ln(Object obj){
		pr(obj);ln();
	}
	public static String str(Object obj){
		return obj.toString();
	}
	public static <E> String str(E[] obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.length;i++){
			sb.append(i==0?"":" ").append(obj[i]);
		}
		return sb.toString();
	}
	public static <E> String str(List<E> obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.size();i++){
			sb.append(i==0?"":" ").append(obj.get(i));
		}
		return sb.toString();
	}


}