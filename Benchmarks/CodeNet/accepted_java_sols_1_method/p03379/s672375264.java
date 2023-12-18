import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x[] = new int[n];
		int xSort[] = new int[n];
		for (int i=0; i<n; i++){
			x[i] = sc.nextInt();
			xSort[i] = x[i];
		}
		Arrays.sort(xSort);
		int median1 = xSort[(n/2)-1];
		int median2 = xSort[n/2];
		for (int i=0; i<n; i++){
			if (x[i] <= median1){
				System.out.println(median2);
			} else {
				System.out.println(median1);
			}
		}
	}
}
