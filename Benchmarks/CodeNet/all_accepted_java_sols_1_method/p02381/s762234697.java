import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		int n;
		n = sc.nextInt();
		if(n==0) {
			break;
		}
		double[] num;
		double sum = 0;
		num = new double[n];
		for(int i = 0;i<n;i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}

		double ave = sum/n;
		double sum_2 = 0;
		for(int i = 0;i<n;i++) {
			sum_2 += (num[i]-ave)*(num[i]-ave);
		}
		double bunsan = sum_2/n;
		double ans = Math.sqrt(bunsan);
		System.out.printf("%f\n",ans);
	}
		sc.close();
	}
}
