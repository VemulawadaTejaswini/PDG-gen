import  java.util.*;
import java.math.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int m, money, years, n, tanri_or_fukuri, charge;
	static double rate;
	static int result;
	public static void main(String[] args) {
		m = sc.nextInt();
		for(int i = 0; i < m; i++){
			result = 0;
			read();
			System.out.println(result);
		}
	}
	static void read(){
		money = sc.nextInt();
		years = sc.nextInt();
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			tanri_or_fukuri = sc.nextInt();
			rate = sc.nextDouble();
			charge = sc.nextInt();
			solve();
		}
	}
	static void solve(){
		int A = money;
		int B = (int)(double)(money*rate);
		int C = 0;
		int res = 0;
		if(tanri_or_fukuri == 0){//P
			for(int i = 0; i < years; i++){
				res = A - charge;
				C = C + B;
				A = res;
				B = (int)(double)(A *rate);
			}
		}else{//¡
			for(int i = 0; i < years; i++){
				res = A + B - charge;
				A = res;
				B = (int)(double)(A *rate);
			}
		}
		result = Math.max(result, res+C);
	}
}