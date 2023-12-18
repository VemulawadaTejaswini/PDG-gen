import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	
	static int n, max, sum;
	static int a[];
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}
	}
	
	public static boolean read(){
		
		n = sc.nextInt();
		
		if(n == 0) return false;
		
		a = new int[n];
		
		for(int i=0; i < n; i++){
			a[i] = sc.nextInt();
		}
		
		return true;
	}
	
	public static void solve(){

		sum = 0;
		max = Integer.MIN_VALUE;
		
		for(int i=0; i < n; i++){
			sum = Math.max(0, sum + a[i]);
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
	}

}