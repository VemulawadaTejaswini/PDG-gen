import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int[] numbers = new int[m];
		for (int i = 0; i < m; i++) {
		    numbers[i] = sc.nextInt();
		}
		int[][] dayNums = new int[d][m];
		for (int i = 0; i < d; i++) {
		    for (int j = 0; j < m; j++) {
		        dayNums[i][j] = sc.nextInt();
		    }
		}
		for (int i = 0; i < d; i++) {
		    boolean flag = true;
		    while (flag && n >= 0) {
		        flag = false;
		        for (int j = 0; j < m; j++) {
		            int x = dayNums[i][j];
		            if (x == -1) {
		                continue;
		            }
		            if (n % numbers[j] != x) {
		                flag = true;
		                n -= (n % numbers[j] - x + numbers[j]) % numbers[j];
		                break;
		            }
		        }
		    }
		}
		if (n < 0) {
		    System.out.println(-1);
		} else {
		    System.out.println(n);
		}
	}
}

