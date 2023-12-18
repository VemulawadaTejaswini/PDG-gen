import java.util.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);

	void solve(){
		int[] is_prime = new int[1000000000];
		is_prime[0] = is_prime[1] = 1;
		for(int i = 2; i < 1000000000; i++){
			if(is_prime[i] == 0) {
				for(int j = i * 2; j < 1000000000; j += i){
					is_prime[j] = 1;
				}
			}
		}
		int n = in.nextInt();
		System.out.print(n);
		System.out.print(":");
		for(int i = 2; i < 1000000000; i++) {
			if(n == 0) break;
			while(is_prime[i] == 0 && n % i == 0){
				n /= i;
				System.out.print(" ");
				System.out.print(i);
			}
		}
		System.out.println();
	}

}