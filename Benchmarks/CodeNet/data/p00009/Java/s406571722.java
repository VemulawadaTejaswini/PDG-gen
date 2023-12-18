import java.util.*;


public class Main {

	static Scanner sc = new Scanner(System.in);
	static Set<Integer> prime_number = new HashSet<Integer>();
	static int max;


	public static void main(String[] args) {

		eratosu(999999);

		while(read()){
			solve();
		}
	}

	public static void eratosu(int max_int){
		for(int i=2; i<=max_int; i++){
			prime_number.add(i);
		}

		for(int i=2; i<=max_int; i++){
			int n = i;
			int x = 2;
			while(n*x <= max_int){
				prime_number.remove(n*x);
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

		for(int i=2; i<max; i++){

			if(prime_number.contains(i)){
				cnt++;
			}
		}

		System.out.println(cnt);

	}

}