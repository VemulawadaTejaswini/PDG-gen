
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[][] dig_num = {{0,1,1,1,1,1,1},
					   {0,0,0,0,1,1,0},
					   {1,0,1,1,0,1,1},
					   {1,1,1,1,0,0,1},
					   {1,1,0,0,1,1,0},
					   {1,1,0,1,1,0,1},
					   {1,1,1,1,1,0,1},
					   {0,0,0,0,1,1,1},
					   {1,1,1,1,1,1,1},
					   {1,1,0,1,1,1,1},
					   {0,0,0,0,0,0,0}};
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == -1) break;
			int[] num = new int[7];
			int p = 10;
			for(int i=0;i<n;i++) {
				int dig = sc.nextInt();
				for(int j=0;j<7;j++) {
					num[j] = (dig_num[p][j]+dig_num[dig][j]) % 2;
					System.out.print(num[j]);
				}
				System.out.println();
				p = dig;
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}