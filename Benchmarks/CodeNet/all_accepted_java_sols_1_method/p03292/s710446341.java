import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = new int[3];
		for (int i=0; i<3; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int totalcost = 0;
		for (int i=1; i<3; i++){
			totalcost += a[i] - a[i-1];
		}
		System.out.println(totalcost);
	}
}