import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
 


public class Main {
	private static Scanner sc = new Scanner(System.in);
	//result = Math.pow(num1, num3)
	//StringBuffer str = new StringBuffer(hoge1);
	//String hoge2 = str.reverse().toString();
	//map.containsKey(A)

	//Map<Integer, Integer> map = new HashMap<Integer, Integer>(n);
	/*for ( キーのデータ型 key : マップの名前.keySet() ) {
		データのデータ型 data = マップの名前.get( key );
		
		// keyやdataを使った処理;
	}*/
	//int i = Integer.parseInt(s);
	//Queue<String> qq=new ArrayDeque<>(); //add,poll,peek
	//Deque<String> qq=new ArrayDeque<>();//push,pop,peek
	//ArrayList<Integer> cc = new ArrayList<>(N);
	//Collections.sort(list);
	//Array.sort(list);   cc.contains(tmp)
	//Arrays.asList(c).contains("a")
	//list.set(1,"walk");//1 1 2 3 5
	static long mod =1000000007;
	//static 	ArrayList<Integer> cc = new ArrayList<>(100);
	static int INF=1000000007;
	

	
	public static void main(String[] args) {
		//int N=sc.nextInt();for(int i=0;i<N;i++) {}
		
		//Ae2+Be2=Ce2
		//StringBuffer str = new StringBuffer(hoge1);
		//for(int i=0;i<N;i++) {}
		//int v[]=new int[];for(int i=0;i<;i++)v[i]=sc.nextInt();
		//int a[]=new int[N];for(int i=0;i<N;i++) {a[i]=sc.nextInt();}
		//String S=sc.next();
	
		int N=sc.nextInt();
		long a[]=new long[N+1];
		long ans=0;
		boolean x=true;
		for(int i=0;i<=N;i++) {a[i]=sc.nextInt();}
		if(a[0]!=0) {
			if(a[0]==1&&N==0) {
				p(1);
			}else p(-1);
		}
		else {
			long v[][]=new long[N+1][2];
			v[N][0]=a[N];
			v[N][1]=a[N];
			
			for(int i=N-1;i>=0;i--) {
				if(v[i+1][0]%2==0)v[i][0]=v[i+1][0]/2+a[i];
				else v[i][0]=v[i+1][0]/2+a[i]+1;
				
				v[i][1]=v[i+1][1]+a[i];
			}
			long t=1;
			
			
			
			ans++;
			for(int i=1;i<=N;i++) {
				
				if(t>v[i][1]){
					x=false;
					break;
				}else if(t*2<v[i][0]) {
					x=false;
					break;
				}else if(t*2>v[i][1]) {
					
					t=v[i][1];
				}else if(t*2<=v[i][1]) {
					
					t=t*2;
				}
				ans+=t;
				
				t-=a[i];
				if(t<0) {
					x=false;
					break;
				}
				
				
			}
			if(x)p(ans);
			else p(-1);
		}
			
		
	}
	static long bi(int i) {
		long t=1;
		for(int a=1;a<=i;a++) {
			t*=a;
			t%=mod;
		}
		return t;
	}
	public static long modPow(long g,long N) {
		long T=1;
		for(int i=0;i<N;i++) {
			T*=g;
			T%=mod;
		}
		return T;
	}
	
	public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
	}
	
	public static long gcd(long a, long b) {
        return b == 0 ? a: gcd(b, a % b);
	}
	static String nextPermutation(String s) {
		ArrayList<Character> list=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			list.add(s.charAt(i));
		}
		int pivotPos=-1;
		char pivot=0;
		for(int i=list.size()-2;i>=0;i--) {
			if(list.get(i)<list.get(i+1)) {
				pivotPos=i;
				pivot=list.get(i);
				break;
			}
		}
		if(pivotPos==-1&&pivot==0) {
			return "Final";
		}
		int L=pivotPos+1,R=list.size()-1;
		
		
		
		int minPos=-1;
		char min =Character.MAX_VALUE;
		
		for(int i=R;i>=L;i--) {
			if(pivot<list.get(i)) {
				if(list.get(i)<min) {
					min=list.get(i);
					minPos=i;
				}
			}
		}
		
		Collections.swap(list, pivotPos, minPos);
		Collections.sort(list.subList(L, R+1));
		
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i));
		}
		return sb.toString();
	}
	


	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	
}
	
