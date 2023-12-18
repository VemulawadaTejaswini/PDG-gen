
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for(int i = 0; i < N; i++) {
			System.out.println(function(i));
		}
	}

	public static int function(int n) {
		int count = 0;
		for(int x = 1; x <= 20; x++ ) {
			for(int y = 1; y <= 20; y++ ) {
				for(int z = 1; z <= 20; z++ ) {
					if(x*x + y*y + z*z + x*y + y*z + z*x == n) {
//						System.out.printf("x = %d, y = %d, z = %d ", x, y, z);
						count++;
					}
				}
			}
		}

		return count;
	}
}
