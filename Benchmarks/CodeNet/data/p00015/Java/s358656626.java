import java.math.BigInteger;
import java.util.Scanner;


public class Main{
	
	static Scanner sc = new Scanner(System.in);

	static int n;
	static BigInteger a[], b[];
	
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}

	}
	
	public static boolean read(){
		if(!sc.hasNext()) return false;
		
		n = sc.nextInt();
		
		a = new BigInteger[n];
		b = new BigInteger[n];
		
		for(int i=0; i < n; i++){
			a[i] = sc.nextBigInteger();
			b[i] = sc.nextBigInteger();
		}
		
		return true;
	}
	
	public static void solve(){
		
		for(int i=0; i < n; i++){
			if(a[i].add(b[i]).toString().length() > 80){
				System.out.println("overflow");
			}
			else{
				System.out.println(a[i].add(b[i]));
			}
		}
	}

}