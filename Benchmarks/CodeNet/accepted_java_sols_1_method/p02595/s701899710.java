import java .util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

	int inputN = sc.nextInt();
	int inputD = sc.nextInt();
	int count = 0;

	for(int i = 0; i < inputN; i++) {
		int xi = sc.nextInt();
		int yi = sc.nextInt();

		double xixi = Math.pow(xi, 2);

		double yiyi = Math.pow(yi, 2);

		double root = xixi + yiyi;

		 double r =Math.sqrt(root);

		if(r <= inputD) {
			count++;
		}
	}
	System.out.println(count);
}
}
