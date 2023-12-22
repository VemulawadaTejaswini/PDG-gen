import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int res = 1;
		double memo = 0;

		for(int i=0; i<N; i++) {
			int H = sc.nextInt();
			double temp = (T - H * 0.006) - A;
			if(temp < 0) {
				temp *= -1;
			}
			if(i == 0) {
				memo = temp +1;
			}
			if(memo > temp) {
				memo = temp;
				res = i +1;
			}
		}

		System.out.println(res);
	}
}
