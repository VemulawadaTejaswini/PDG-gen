import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] x = new int[5];
		int[] y = new int[5];

		int total=0;
		int miny=10;
		for (int i=0;i<5;i++) {
			x[i] = sc.nextInt();
			y[i] = x[i]%10;
			total += x[i] - y[i];
			if(y[i]>0) {
				if(y[i]<miny) {
					miny = y[i];
				}
				y[i] = 10;
			}
		}

		for (int i=0;i<5;i++) {
			total += y[i];
		}

		System.out.println(miny==10 ? total : total+miny-10);

	}
}