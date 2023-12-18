import java.util.*;


public class Main {

	static Scanner sc = new Scanner(System.in);
	static boolean[] prime_number;
	static int max;


	public static void main(String[] args) {

		eratosu(999999);

		while(read()){
			solve();
		}
	}

	public static void eratosu(int max_int){
		prime_number = new boolean[max_int+1];

		prime_number[0] = false;
		prime_number[1] = false;

		for(int i=2; i<=max_int; i++){
			prime_number[i] = true;
		}

		for(int i=2; i<=max_int; i++){
			int n = i;
			int x = 2;
			while(n*x <= max_int){
				prime_number[n*x] = false;
				x++;
			}
		}

	}

	public static Boolean read(){
		if(!sc.hasNextInt())  return false;
		max = sc.nextInt();
		return true;
	}


	public static void solve(){
		int cnt = 0;

		for(int i=2; i<=max; i++){

			if(prime_number[i]){
				cnt++;
			}
		}

		System.out.println(cnt);

	}

}