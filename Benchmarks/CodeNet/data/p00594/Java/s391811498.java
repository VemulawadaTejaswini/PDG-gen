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
		}
	}

	static void solve(int n){
		for(int i = 0; i < n; i++){
			Integer m = scanner.nextInt();
			Integer num = map.get(m);
			if(num != null){
				num++;
				map.put(m, num);
			}else{
				map.put(m, num);
			}
			if(i % 30000 == 0) System.gc();
		}
	}
}