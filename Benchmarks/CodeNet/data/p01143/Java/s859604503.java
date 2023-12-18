import java.util.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	static int n, m;
	static double p;
	static int[] x;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		m = sc.nextInt();
		p = sc.nextDouble();
		if(n == 0 && m == 0 && p == 0)return false;
		x = new int[n];
		for(int i = 0; i < x.length; i++){
			x[i] = sc.nextInt();
		}
		return true;
	}
	
	static void solve(){
		double sum = 0.0;
		for(int i = 0; i < x.length; i++){
			sum += x[i];
		}
		sum *= 100;
		double per = p/100;
		sum -= sum*per;
		//System.out.println(sum);
		if(x[m-1] == 0){
			System.out.println(0);
		}else{
			int res = (int)sum/x[m-1];
			System.out.println(res);
		}
	}

}