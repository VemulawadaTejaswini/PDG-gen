import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		boolean flag = false;

		A:for(int x = 0; x <= Math.min(Y/10000, N); x++) {
			for(int y = 0; y <= Math.min((Y-10000*x)/5000, N-x); y++){
				int k = Y - 10000*x - 5000*y;
				if(k%1000 == 0) {
					int z = k/1000;
					if(z == (N - x - y)) {
						System.out.printf("%d %d %d", x, y, z);
						flag = true;
						break A;
					}
				}
			}
		}
		if(!flag) System.out.printf("-1 -1 -1");
		sc.close();
	}
}