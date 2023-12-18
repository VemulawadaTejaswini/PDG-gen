import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int a,d,n;
	static boolean read(){
		a = sc.nextInt();
		d = sc.nextInt();
		n = sc.nextInt();
		if(a == 0 && d == 0 && n == 0 ){
			return false;
		}
		return true;
	}
	static boolean isPrime(int n){
		if(n == 1){
			return false;
		}
		boolean ret = true;
		for(int i = 2; i*i <= n; i++){
			if(n % i == 0){
				ret = false;
				break;
			}
		}
		return ret;
	}		
	static int slove(){
		int ret = 0, count = 0;
		for(int i = 0;; i++){
			ret = a+d * i;
			if(isPrime(ret))
				count++;
			if(count == n)
				return ret;
		}
	}
	public static void main(String[] args){
		while(read()){
			System.out.println(slove());
		}
	}
}