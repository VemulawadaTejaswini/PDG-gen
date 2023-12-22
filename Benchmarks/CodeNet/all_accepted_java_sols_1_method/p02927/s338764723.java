
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int D = sc.nextInt();
		int cnt = 0;
		for(int m = 1 ; m <= M ; ++m){
			for(int d = 1 ; d <= D ; ++d){
				int d0 = d % 10;
				int d1 = d / 10;
				if(d0 * d1 == m && d0 >= 2 && d1 >= 2){
					++cnt;
				}
			}
		}
		System.out.println(cnt);
	}
}
