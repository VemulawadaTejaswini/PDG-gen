import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int[] a = new int[sc.nextInt()];
			for(int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int[] b = new int[sc.nextInt()];
			for(int i = 0; i < b.length; i++) {
				b[i] = sc.nextInt();
			}
			boolean inc = true;
			for(int e : b) {
				int loc = Arrays.binarySearch(a, e);
				if(loc < 0) {
					inc = false;
					break;
				}
			}
			System.out.println(inc ? "1" : "0");				
		}
	}
}
