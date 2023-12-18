
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for(int i = 1; i <= N; i++) {
			System.out.println(function(i));
		}
	}

	public static int function(int n) {
		int count = 0;
		for(int x = 1; x <= n; x++ ) {
			for(int y = 1; y <= n; y++ ) {
				for(int z = 1; z <= n; z++ ) {
					if(x*x + y*y + z*z + x*y + y*z + z*x == n) {
//						System.out.printf("x = %d, y = %d, z = %d ", x, y, z);
						count++;
					}else if(x*x + y*y + z*z + x*y + y*z + z*x > n) {
						break;
					}
				}
				if(x*x + y*y + x*y> n) {
					break;
				}
			}
			if(x*x > n) {
				break;
			}
		}

		return count;
	}
}
