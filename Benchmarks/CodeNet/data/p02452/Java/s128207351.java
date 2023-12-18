import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static public void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] array = new int[n];
		for(int i=0; i<n; i++) {
			array[i] = scan.nextInt();
		}

		int m = scan.nextInt();
		int[] array2 = new int[m];
		for(int i=0; i<m; i++) {
			array2[i] = scan.nextInt();
		}
		
		boolean flag = true;
		
		for(int c : array2) {

			int reaction = Arrays.binarySearch(array, c);
			if(reaction < 0) {
				flag = false;
				// System.out.println("debug");
				break;
			}
		}
		System.out.println(flag ? "1" : "0");
	}
}


