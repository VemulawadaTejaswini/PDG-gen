
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];

		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);

		double medA, medB;
		if(n % 2 == 1){
			medA = a[n/2];
			medB = b[n/2];

			System.out.println((int)(medB - medA + 1));
		}
		else {
			medA = (a[n/2 - 1] + a[n/2])/2.0;
			medB = (b[n/2 - 1] + b[n/2])/2.0;
			System.out.println((int)((medB - medA)*2 + 1));
		}
	}

}
