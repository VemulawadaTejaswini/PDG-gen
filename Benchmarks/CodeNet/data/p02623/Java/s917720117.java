/*
 * Remember a 6.72 student can know more than a 10.0 student.
 * Grades don't determine intelligence, they test obedience.
 * I Never Give Up.
 * I will become Candidate Master.
 * I will defeat Saurabh Anand.
 * Skills are Cheap,Passion is Priceless.
 * Obsession is necessary.
 * Author : Sameer Raj
 */
import java.util.*;
import java.util.Map.Entry;
import java.io.*;
import java.lang.Math.*;
import java.math.BigInteger;

import static java.lang.System.*;
import static java.util.Arrays.fill;
import static java.lang.Math.log;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.floor;
import static java.lang.Math.ceil;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;
import static java.util.Arrays.spliterator;
public class Main implements Runnable{
	private static Reader in=new Reader();
	private static StringBuilder ans=new StringBuilder();
	private static long MOD=(long)1e9+7;
	private static final int N=(int) (2e5+7); // 2e5+7
	private static ArrayList<Integer> v[]=new ArrayList[N];
	private static HashMap<String,Integer> cmap=new HashMap();
	private static boolean mark[]=new boolean[N];
	//    private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	/*Not try to hack the sort function*/
	public static void sort(long arr[]){
		for(int i=arr.length-1;i>=2;i--){
			int x=new Random().nextInt(i-1);
			long temp=arr[x];
			arr[x]=arr[i];
			arr[i]=temp;
		}
		Arrays.sort(arr);
	}
	public static void sort(int arr[]){
		for(int i=arr.length-1;i>=2;i--){
			int x=new Random().nextInt(i-1);
			int temp=arr[x];
			arr[x]=arr[i];
			arr[i]=temp;
		}
		Arrays.sort(arr);
	}
	public static void sort(String arr[]){
		for(int i=arr.length-1;i>=2;i--){
			int x=new Random().nextInt(i-1);
			String temp=arr[x];
			arr[x]=arr[i];
			arr[i]=temp;
		}
		Arrays.sort(arr);
	}
	public static void sort(Pair arr[]){
		for(int i=arr.length-1;i>=2;i--){
			int x=new Random().nextInt(i-1);
			Pair temp=arr[x];
			arr[x]=arr[i];
			arr[i]=temp;
		}
		Arrays.sort(arr);
	}
	private static long gcd(long a, long b){
		if(b==0)return a;
		return gcd(b,a%b);
	}
	public static long lcm(long a,long b){
		return min(a,b)*(max(a,b)/gcd(a,b));
	}
	/*--------------------------------------------------------------------------------------------------------------*/
	/*Code lies here*/
	public static int solve(long a[],long b[],long k){
		long rem;
		int l=0,r=0,mid,res=0;
		for(int i=0;i<a.length;i++){
			rem=k-a[i];
			l=0;r=b.length-1;
			while(l+1!=r){
				mid=(l+r)/2;
				if(b[mid]<=rem)l=mid;
				else r=mid;
//				pln(i+" "+l+" "+r+" "+rem);
			}
			if(b[r]<=rem){res=max(res,i+1+r+1);}
			else if(b[l]<=rem){res=max(res,i+1+l+1);}
		}
		return res;
	}
	@Override
	public void run(){
		int n=in.nextInt();
		int m=in.nextInt();
		int k=in.nextInt();
		long ar[]=new long[n];
		long br[]=new long[m];
		for(int i=0;i<n;i++){
			if(i==0)ar[i]=in.nextLong();
			else ar[i]=ar[i-1]+in.nextLong();
		}
		for(int i=0;i<m;i++){
			if(i==0)br[i]=in.nextLong();
			else br[i]=br[i-1]+in.nextLong();
		}
		pn(max(solve(ar,br,k),solve(br,ar,k)));
	}
	public static void main(String[] args) throws IOException{
		new Thread(null,new Main(),"Accepted",1<<26).start();
		/* 0_0 I am watching you 0_0 */
	}
	static class Pair<T> implements Comparable<Pair>{
		long l;
		long r;
		Pair(){
			l=0;
			r=0;
		}
		Pair(long k,long v){
			l=k;
			r=v;
		}
		@Override
		public int compareTo(Pair o){
			if(l!=o.l)return (int)(l-o.l);
			return (int)(r-o.r);
		}
	}
	/* BINARY SEARCH FUNCTIONS */
	public static int ceilSearch(int l,int r,int val,int ar[]){
		int mid;
		while(l+1!=r&&l<r){
			mid=(l+r)/2;
			if(ar[mid]<val)l=mid;
			else r=mid;
		}
		if(ar[l]>=val)return l;
		else if(ar[r]>=val)return r;
		else return -1;
	}
	public static int ceilSearch(int l,int r,long val,long ar[]){
		int mid;
		while(l+1!=r&&l<r){
			mid=(l+r)/2;
			if(ar[mid]<val)l=mid;
			else r=mid;
		}
		if(ar[l]>=val)return l;
		else if(ar[r]>=val)return r;
		else return -1;
	}
	public static int floorSearch(int l,int r,int val,int ar[]){
		int mid;
		while(l+1!=r&&l<r){
			mid=(l+r)/2;
			if(ar[mid]>val)r=mid;
			else l=mid;
		}
		if(ar[r]<=val)return r;
		else if(ar[l]<=val)return l;
		else return -1;
	}
	public static int floorSearch(int l,int r,long val,long ar[]){
		int mid;
		while(l+1!=r&&l<r){
			mid=(l+r)/2;
			if(ar[mid]>val)r=mid;
			else l=mid;
		}
		if(ar[r]<=val)return r;
		else if(ar[l]<=val)return l;
		else return -1;
	}
	/* MODULAR OPERATIONS */
	private static long mod(long a,long b){ //a%b
		return (b+a%b)%b;
	}
	private static long modInv(long a){
		return powmod(a,MOD-2);
	}
	private static long powmod(long x,long n){
		if(n==0||x==0)return 1;
		else if(n%2==0)return(powmod((x*x)%MOD,n/2));
		else return (x*(powmod((x*x)%MOD,(n-1)/2)))%MOD;
	}
	public static long mult(long a,long b){
		return mod(mod(a,MOD)*mod(b,MOD),MOD);
	}
	public static long add(long a,long b){
		return mod(mod(a,MOD)+mod(b,MOD),MOD);
	}
	public static long sub(long a,long b){
		return mod(mod(a,MOD)-mod(b,MOD),MOD);
	}
	/* MAX-MIN FUNCTIONS */
	public static long min(long a,long b){
		return Math.min(a, b);
	}
	public static int min(int a,int b){
		return Math.min(a, b);
	}
	public static long max(long a,long b){
		return Math.max(a, b);
	}
	public static int max(int a,int b){
		return Math.max(a, b);
	}
	public static long min(long ar[]){
		return Arrays.stream(ar).min().getAsLong();
	}
	public static int min(int ar[]){
		return Arrays.stream(ar).min().getAsInt();
	}
	public static long max(long ar[]){ return Arrays.stream(ar).max().getAsLong();}
	public static int max(int ar[]){ return Arrays.stream(ar).max().getAsInt(); }
	//Reader Class
	static class Reader{
		BufferedReader br;
		StringTokenizer st;
		public Reader(){br=new BufferedReader(new InputStreamReader(System.in));}
		String next(){
			while(st==null||!st.hasMoreElements()){
				try{st=new StringTokenizer(br.readLine());
				}catch(IOException e){e.printStackTrace();}
			}
			return st.nextToken();
		}
		int nextInt(){return Integer.parseInt(next());}
		long nextLong(){return Long.parseLong(next());}
		double nextDouble(){return Double.parseDouble(next());}
		String nextLine(){
			String str="";
			try{
				str=br.readLine();
			}catch(IOException e){
				e.printStackTrace();
			}
			return str;
		}
	}
	//Looping methods
	static void rep(int ar[],int start,int end){
		for(int i=start;i<end;i++)
			ar[i]=in.nextInt();

	}
	static void rep(long ar[],int start,int end){
		for(int i=start;i<end;i++)
			ar[i]=in.nextLong();
	}
	static void rep(String ar[],int start,int end){
		for(int i=start;i<end;i++)
			ar[i]=in.next();
	}
	static void rep(int ar[][],int n,int m){
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				ar[i][j]=in.nextInt();
		}
	}
	static void rep(long ar[][],int n,int m){
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				ar[i][j]=in.nextLong();
		}
	}
	//Printer Methods
	static void pn(Object o){out.print(o);}
	static void pln(Object o){out.println(o);}
	static void pln(){out.println();}
	static void pf(String format,Object o){out.printf(format,o);}
	//Appenders
	static void app(Object o){ans.append(o);}
	static void appn(Object o){ans.append(o+"\n");}
}