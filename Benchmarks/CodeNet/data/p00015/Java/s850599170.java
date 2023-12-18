import java.util.*;
import java.math.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static BigInteger a, b;
	public static void main(String[] args) {
		while(read()){
			
		}
	}
	static boolean read(){
		if(!sc.hasNext())return false;
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			a = sc.nextBigInteger(); b = sc.nextBigInteger();
			solve();
		}
		return true;
	}
	static void solve(){
		if(a.add(b).toString().length() > 80){
			System.out.println("overflow");
		}else{
			System.out.println(a.add(b));
		}
	}
}