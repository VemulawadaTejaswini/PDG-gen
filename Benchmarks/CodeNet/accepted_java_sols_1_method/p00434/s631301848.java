
import java.util.Arrays;
import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[28];
		for(int i = 0; i < 28; i++) {
			a[i] = stdIn.nextInt();
		}
		Arrays.sort(a);
		
		for(int i = 1; i <= 30; i++) {
			if(Arrays.binarySearch(a, i)< 0) {
				System.out.println(i);
			}
		}
	}
}