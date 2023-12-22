import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		double length = 0;
		int count = 0;
		
		for(int i=0;i<n;i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			length = Math.pow(x[i], 2) + Math.pow(y[i], 2);
			length = Math.sqrt(length);
			if(length <= d) {
				count++;
			}
		}
		System.out.println(count);

	}

}
