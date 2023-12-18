import java.util.Scanner;


public class  Main {

	static Scanner sc = new Scanner(System.in);
	
	static double v;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext()) return false;
		
		v = sc.nextDouble();
		
		return true;
	}
	
	static void solve(){
		
		int N=0;
		double t, y, height;
		
		t = v / 9.8;
		y = 4.9 * Math.pow(t, 2.0);
		
		do{
			N++;
			height = 5 * (double)N - 5;
		}while(height < y);
		
		System.out.println(N);
	}

}