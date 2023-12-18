import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, y;
	static int[][] banks;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if( n == 0 )return false;
		banks = new int[n][3];
		y = sc.nextInt();
		for(int i = 0; i < banks.length; i++){
			banks[i][0] = sc.nextInt();
			banks[i][1] = sc.nextInt();
			banks[i][2] = sc.nextInt();
		}
		return true;
	}
	
	static void solve(){
		double max = -1.0;
		int res = -1;
		for(int i = 0; i < banks.length; i++){
			double money = 0.0;
			if( banks[i][2] == 1 ){
				money = getSimpleInterest(banks[i]);
			}else{
				money = getCompoundInterest(banks[i]);
			}
			if( max < money ){
				res = banks[i][0];
				max = money;
			}
		}
		System.out.println(res);
	}
	
	static double getSimpleInterest(int[] data){
		double r = (double)data[1];
		return 10000*(1+y*r/100);
	}
	
	static double getCompoundInterest(int[] data){
		double r = (double)data[1];
		return 10000*Math.pow(1+r/100, y);
	}

}