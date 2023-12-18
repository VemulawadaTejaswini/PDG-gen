
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] array = new long[n];
		long result = 1;
		boolean flg = true;
		for(int i=0; i<n; i++) {
			array[i] = sc.nextLong();
			if(array[i] == 0) {
				flg = false;
				result = 0;
			}
		}
		if(flg) {
			for(int j=0; j<n; j++) {
				result *= array[j];
				if(result > 1000000000000000000L || result < 0) {
				result = -1;
				break;
				}
			}
		}
		System.out.println(result);
	}

}
