import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static double a, b;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if( !sc.hasNext() )return false;
		a = sc.nextDouble();
		b = sc.nextDouble();
		return true;
	}
	
	static void solve(){
		double res = a * b / 3.305785;
		System.out.println(res);
	}

}