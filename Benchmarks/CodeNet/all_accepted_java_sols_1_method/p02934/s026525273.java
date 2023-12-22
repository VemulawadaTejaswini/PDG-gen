import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double d =0.0;
		for (int i=0;i<n;i++) {
			int temp = sc.nextInt();
			d+=((double)1/(double)temp);
		}
		System.out.println((double)1/d);

	}
}