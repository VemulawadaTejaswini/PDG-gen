import java.util.HashMap;
import java.util.Scanner;

class Main{

	static Scanner scanner = new Scanner(System.in);
	static HashMap<Integer, Integer> map;

	public static void main(String args[]){

		while(true){
			int n = scanner.nextInt();
			map = new HashMap<Integer, Integer>();
			if(n == 0) break;
			solve(n);
			System.gc();
		}
	}

	static void solve(int n){
		for(int i = 0; i < n; i++){
			scanner.next();
		}
	}
}