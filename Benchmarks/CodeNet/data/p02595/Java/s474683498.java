import java.util.Scanner;

public class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc =  new Scanner(System.in);
		// 2次元の中の個数
		int n = Integer.parseInt(sc.next());
		// 原点からの距離
		double d = Integer.parseInt(sc.next());
		
		int result = 0 ;
		for(int i = 0; i < n; i++) {
			double x = Integer.parseInt(sc.next());
			double y = Integer.parseInt(sc.next());
			double distance = Math.sqrt(x*x + y*y); 
			if (distance <= d) {
				result++;
			}
		}
		System.out.println(result);

	}
}
