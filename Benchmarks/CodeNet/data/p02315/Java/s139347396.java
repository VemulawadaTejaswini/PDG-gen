import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 


public class Main {
	static int a1[]= {0,-1,0,1};
	static int b1[]= {-1,0,1,0};
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
	//list.set(1,"walk");
	static int N,W;
	static int v[]=new int[10000];
	static int w[]=new int[10000];
	public static void main(String[] args) {
		 N=sc.nextInt();
		 W=sc.nextInt();
		for(int i=0;i<N;i++) {
			v[i]=sc.nextInt();
			w[i]=sc.nextInt();
		}
		p(search(0,W));
	}
	static int res;
	static int memo[][]=new int[110][10001];
	static boolean done[][]=new boolean[110][10001];
	static int search(int i,int weight) {
		if(done[i][weight])return memo[i][weight];
		if(i>N) {
			return 0;
		}
		if(w[i]>weight)res= search(i+1,weight);
		else res=Math.max(search(i+1,weight), search(i+1,weight-w[i])+v[i]);
		memo[i][weight]=res;
		done[i][weight]=true;
		return res;
	}
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
}
	

