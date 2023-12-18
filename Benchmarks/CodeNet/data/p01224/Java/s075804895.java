import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[] divisor;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		N = sc.nextInt();
		if(N == 0)
			return false;
		
		return true;
	}
	static void solve(){
		int Sum = 0;
		int k = 0;
		divisor = new int[10000000];
		for(int i = 1; i < N/2+1; i++){
			if(N%i == 0){
				divisor[k] = i;
				Sum = Sum + divisor[k];
				k++;
			}
		}
		if(Sum == N){
			System.out.println("perfect number");
		}else if(Sum > N){
			System.out.println("abundant number");
		}else{
			System.out.println("deficient number");
		}
	}

}