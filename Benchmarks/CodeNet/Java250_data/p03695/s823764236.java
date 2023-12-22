import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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
		int N=sc.nextInt();
		
		int a[]=new int[8];
		
		int ans=0;
		int ansP=0;
		
		for(int i=0;i<N;i++) {
			int v=sc.nextInt();
			int x;
			if(v<400)x=0;
			else if(v<800)x=1;
			else if(v<1200)x=2;
			else if(v<1600)x=3;
			else if(v<2000)x=4;
			else if(v<2400)x=5;
			else if(v<2800)x=6;
			else if(v<3200)x=7;
			else {ansP++;
			continue;
			}
			
			if(a[x]==0) {
				a[x]++;
				ans++;
			}
			
		}
		if(ans==0) {
			if(ansP>0) {
				p(1+" "+(ans+ansP));
			}else {
				p(0+" "+0);
			}
		}else p(ans+" "+(ans+ansP));
		
		
		
	}
	
	
	
	
	/*static boolean v(int i,long sum1,long sum2) {
		if(i==N) {
			long b=Math.abs(sum1-sum2);
			if(b==0) {
				if(sum1<=K) {
					return true;
				}else return false;
			}else if(b%D==0) {
				if(Math.max(sum1, sum2)<=K)return true;
				else return false;
			}
			else return false;
		}
		
		if(v(i+1,sum1,sum2+v[i]%D))return true;
		
		if(v(i+1,sum1+D-v[i]%D,sum2))return true;
		return false;
		
	}*/
	
	
	
	
	

	


	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	public static int gcd(int a, int b) {
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
}
	
