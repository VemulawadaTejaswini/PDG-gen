
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] array = new int[n];

		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		for(int j=0; j<(n-1); j++) {
			System.out.print(array[n-1-j] + " ");
		}
		System.out.println(array[0]);
	}
}
