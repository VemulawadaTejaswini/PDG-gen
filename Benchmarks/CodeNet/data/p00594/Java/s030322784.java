import java.util.HashMap;
import java.util.Scanner;

class Main{

	static Scanner scanner = new Scanner(System.in);
	static HashMap<Integer, Integer> map;

	public static void main(String args[]){
		while(true){
			int n = scanner.nextInt();
			if(n == 0) break;
			map = new HashMap<Integer, Integer>();
			System.out.println(solve(n));
		}
	}

	static String solve(int n){
		int i = 0;
		Integer m;
		Integer num;
		String result = "NO COLOR";
		for(i = 0; i < n; i++){
			m = scanner.nextInt();
			num = map.get(m);
			if(num != null){
				num++;
				map.put(m, num);
				if(num > n/2) result = m + "";
			}else{
				map.put(m, 1);
				num = 1;
				if(num > n/2) result = m + "";
			}
			if(i % 50000 == 0) System.gc();
		}
		return result;
	}
}