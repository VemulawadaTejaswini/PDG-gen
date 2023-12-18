import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	boolean isPrime(final int n){
		for(int i=n-1; 2<=i; --i){
			if(n%i==0){ return false; }
		}
		return true;
	}
	
	String solve(final int n){
		String str = "";
		
		for(int i=n-1; 2<=i; --i){
			if(isPrime(i)){
				str += i;
				break;
			}
		}
		for(int i=n+1;;++i){
			if(isPrime(i)){
				str += " " + i;
				break;
			}
		}
		
		return str;
	}
	
	void io(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			final int n = sc.nextInt();
			System.out.println(solve(n));
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}
	
	void debug(Object... os){
		System.out.println(Arrays.deepToString(os));
	}
}