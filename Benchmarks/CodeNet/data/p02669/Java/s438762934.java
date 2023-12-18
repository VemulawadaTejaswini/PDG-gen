import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
 


public class Main {
	private static Scanner sc = new Scanner(System.in);
	//result = Math.pow(num1, num3)
	//StringBuffer str = new StringBuffer(hoge1);
	//String hoge2 = str.reverse().toString();
	//map.containsKey(A)

	//Map<String, Integer> map = new HashMap<String, Integer>(n);
	/*for ( キーのデータ型 key : マップの名前.keySet() ) {
		データのデータ型 data = マップの名前.get( key );
		
		// keyやdataを使った処理;
	}*/
	//int i = Integer.parseInt(s);
	//Queue<String> qq=new ArrayDeque<>(); //add,poll,peek
	//Deque<String> qq=new ArrayDeque<>();//push,pop,peek
	//ArrayList<String> cc = new ArrayList<>(n);
	//Collections.sort(list);
	//Array.sort(list);   cc.contains(tmp)
	//Arrays.asList(c).contains("a")
	//list.set(1,"walk");//1 1 2 3 5
	static long mod =1000000007;
	//static 	ArrayList<Integer> cc = new ArrayList<>(100);
	static int INF=1000000007;
	
	public static void main(String[] args) {
		//int N=sc.nextInt();for(int i=0;i<N;i++) {}
		//int a[]=new int[N];for(int i=0;i<N;i++) {}
		//Ae2+Be2=Ce2
		//StringBuffer str = new StringBuffer(hoge1);
		//for(int i=0;i<N;i++) {}
		int T=sc.nextInt();
		
		long N[]=new long[T];
		long A[]=new long[T];
		long B[]=new long[T];
		long C[]=new long[T];
		long D[]=new long[T];
		for(int i=0;i<T;i++) {
			N[i]=sc.nextLong();
			A[i]=sc.nextLong();
			B[i]=sc.nextLong();
			C[i]=sc.nextLong();
			D[i]=sc.nextLong();
			
		}
		
		long v[]=new long[T];
		
		
		
		for(int i=0;i<T;i++) {
			v[i]=(long) Math.pow(10, 18);
			
			
			Queue<Long> qq=new ArrayDeque<>(); //add,poll,peek
			
			
			long f=1;
			long q[]=new long[3];
			while(f<N[i]) {
				f*=2;
				q[0]++;
			}
			
			f=1;
			while(f<N[i]) {
				f*=3;
				q[1]++;
			}
			
			f=1;
			while(f<N[i]) {
				f*=5;
				q[2]++;
			}
			
			
			long t1=1;
			for(long a=0;a<q[0];a++) {
				if(a!=0) {
					t1*=2;
				}
				long t2=1;
				for(long b=0;b<q[1];b++) {
					if(b!=0) {
						t2*=3;
					}
					long t3=1;
					for(long c=0;c<q[2];c++) {
						if(c!=0) {
							t3*=5;
						}
						long coin=A[i]*a+B[i]*b+C[i]*c;
						long J=t1*t2*t3;
						
						long h=N[i]/J;
						
						
						
						long M1=N[i]-h*J;
						
						
						if(M1>1&&J>=M1) {
							long l=J;
							long aa=a;
							long bb=b;
							long cc=c;
							
							while(M1<l) {
								if(aa!=0&&l%2==0) {
									l/=2;
									aa--;
								}else if(bb!=0&&l%3==0) {
									l/=3;
									bb--;
								}else if(cc!=0&&l%5==0){
									l/=5;
									cc--;
								}else {
									l=1;
									break;
								}
							}
							
							M1-=l-1;
							
						}
						if(coin+h*D[i]+M1*D[i]>0) {
							v[i]=Math.min(coin+h*D[i]+M1*D[i], v[i]);
						}
						
						
						long M2=(h+1)*J-N[i];
						if(M2>1&&J>=M2) {
							long l=J;
							long aa=a;
							long bb=b;
							long cc=c;
							
							while(M2<l) {
								if(aa>0&&l%2==0) {
									l/=2;
									aa--;
								}else if(bb>0&&l%3==0) {
									l/=3;
									bb--;
								}else if(cc>0&&l%5==0){
									l/=5;
									cc--;
								}else {
									l=1;
									break;
								}
								
							}
							
							M2-=l-1;
							
						
					}
						if(coin+(h+1+M2)*D[i]>0) {
							v[i]=Math.min(coin+(h+1+M2)*D[i], v[i]);
						}
						
						
					if(J>N[i])break;
				}
			}}
			
			
		}
			
		for(long i:v) {
			p(i);
		}
	
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
	
