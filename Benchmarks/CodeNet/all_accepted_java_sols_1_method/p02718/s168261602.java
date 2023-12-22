import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double m = scan.nextDouble();

		double[] a = new double[n];

		int i;
		double sum = 0;
		for(i = 0; i < n; i++) {
			a[i] = scan.nextDouble();
			sum += a[i];
		}
		double temp = sum * (1 / (4 * m));
		int cnt = 0;
		for(i = 0; i < n; i++) {
			if(a[i] >= temp)
				cnt++;
		}

		if(cnt >= m) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
