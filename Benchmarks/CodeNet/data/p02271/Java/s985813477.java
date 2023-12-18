import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] data = new int[n];
    	for (int i = 0; i < n; i++) {
    		data[i] = sc.nextInt();
    	}
		
    	Arrays.sort(data);
    	for (int i = 0; i < n / 2; i++) {
    		int temp = data[i];
    		data[i] = data[n - i - 1];
    		data[n - i - 1] = temp;
    	}
    	
    	int q = sc.nextInt();
    	for (int i = 0; i < q; i++) {
    		if (solve(data, 0, sc.nextInt())) {
    			System.out.println("yes");
    		} else {
    			System.out.println("no");
    		}
    	}

    	sc.close();
	}

	private static boolean solve(int[] data, int p, int m) {
		if (m == 0) {
			return true;
		} else if (m < 0 || p >= data.length) {
			return false;
		} else {
			if (solve(data, p + 1, m - data[p])) {
				return true;
			}
			if (solve(data, p + 1, m)) {
				return true;
			}
			
			return false;
		}
	}
}