import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		return true;
	}
	
	static void solve(){
		int sum = 1;
		for(int i = 2; i*i <= n; i++){
			if(n%i == 0){
				if(i*i == n){
					sum += i;
				}else{
					sum += i + n/i;
				}
			}
		}
		System.out.println(sum);
		if(n == 1){
			System.out.println("deficient number");
		}else if(sum == n){
			System.out.println("perfect number");
		}else if(sum > n){
			System.out.println("abundant number");
		}else{
			System.out.println("deficient number");
		}
	}

}