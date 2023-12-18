import java.util.*;
import java.math.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	
	public static void main(String[] args){
		read();
		slove();
	}
	static boolean read(){
		n = sc.nextInt();
		return true;
	}
	static void slove(){
		double Debt = 100000;
		for(int i = 1; i <= n; i++){
			Debt = Debt*1.05;
		}
		Debt = Debt/10000;
		Debt = Math.ceil(Debt)*10000;
		System.out.println((int)Debt);
	}
	
	
}