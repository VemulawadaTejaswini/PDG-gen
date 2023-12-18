import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
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
	
	
	public static void main(String[] args) {
		//int N=sc.nextInt();for(int i=0;i<N;i++) {}
		//int a[]=new int[N];
		//Ae2+Be2=Ce2
		//StringBuffer str = new StringBuffer(hoge1);
		//for(int i=0;i<N;i++) {}
		
		//int N=sc.nextInt();for(int i=0;i<N;i++) {}
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		
		
		for(int i=0;i<M;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			if(map.containsKey(a)) {
				ArrayList<Integer> c=map.get(a);
				c.add(b);
				map.replace(a, c);
			}else {
				ArrayList<Integer> c=new ArrayList<Integer>();
				c.add(b);
				map.put(a, c);
			}
			if(map.containsKey(b)) {
				ArrayList<Integer> c=map.get(b);
				c.add(a);
				map.replace(b, c);
			}else {
				ArrayList<Integer> c=new ArrayList<Integer>();
				c.add(a);
				map.put(b, c);
			}
		}
		
		
		int v[]=new int[N];
		Queue<Integer> qq=new ArrayDeque<>(); 
		Queue<Integer> qq2=new ArrayDeque<>(); 
		int sum=0;
		ArrayList<Integer> c=map.get(1);
		
		for(int t=0;t<c.size();t++) {
				v[c.get(t)-1]=1;
				qq.add(c.get(t));
				sum++;
			}	
		
	ArrayList<Integer> cc;
	int t;
	for(int i=2;i<=N;i++) {
		
		if(sum==N)break;
		if(qq.peek()!=null) {
			while(qq.peek()!=null) {
				t=qq.poll();
				cc=map.get(t);

				for(int tt=0;tt<cc.size();tt++) {
					if(v[cc.get(tt)-1]==0) {
						v[cc.get(tt)-1]=t;
						sum++;
						qq2.add(cc.get(tt));
					}
				}
			}
		}else {
			while(qq2.peek()!=null) {
				t=qq2.poll();
				cc=map.get(t);
				
				for(int tt=0;tt<cc.size();tt++) {
					if(v[cc.get(tt)-1]==0) {
						v[cc.get(tt)-1]=t;
						sum++;
						qq.add(cc.get(tt));
					}
				}
		}
		}
		
	}
	
		if(sum==N) {
			p("Yes");
			for(int i=1;i<N;i++) {
				p(v[i]);
			}
		}else {
			p("No");
		}
	}
	public static Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>(20001);	
		
	//static int ans=10000009;
	
		
	
	
	
	public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
	}
	
	public static long gcd(long a, long b) {
        return b == 0 ? a: gcd(b, a % b);
	}

	


	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	
}
	
