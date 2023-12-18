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
		int i = 0;
		Integer m;
		Integer num;
		for(; i < n/2; i++){
			m = scanner.nextInt();
			num = map.get(m);
			if(num != null){
				num++;
				map.put(m, num);
			}else{
				map.put(m, num);
			}
			if(i % 30000 == 0) System.gc();
		}

		for(; i < n; i++){
			m = scanner.nextInt();
			num = map.get(m);
			if(num != null){
				num++;
				if(num > 2/n) return;
				map.put(m, num);
			}
			if(i % 30000 == 0) System.gc();
		}
	}
}