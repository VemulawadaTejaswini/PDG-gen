import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(0);
		int s;
		for(int i=0;i<n;i++){
			s = sc.nextInt();
			if(!map.containsKey(s)){
				map.put(s, 0);
			}
			map.put(s,map.get(s)+1);
		}
		int q = sc.nextInt();
		int t;
		int ans = 0;
		for(int i=0;i<q;i++){
			t = sc.nextInt();
			if(map.containsKey(t)) ans++;
		}
		cout(ans);
	}
	
	
	
	public static boolean isPrime(int n){
		for(int i=2;i<=n*n;i++){
			if(n%i==0) return true;
		}
		return false;
	}
	public static int gcd(int a,int b){
		if(a%b==0) return b;
		else return gcd(b,a%b);
	}
	public static void showary(int[] ary){
		for(int i=0;i<ary.length-1;i++){
			System.out.print(ary[i]+" ");
		}
		cout(ary[ary.length-1]);
	}
	public static void cout(String n){
		System.out.println(n);
	}
	
	public static void cout(int n){
		System.out.println(n);
	}
	public static void cout(boolean n){
		if(n==true){
			cout("true");
		}else{
			cout("false");
		}
	}
}