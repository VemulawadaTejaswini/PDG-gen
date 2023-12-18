import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double a = sc.nextDouble();
			double[] b = new double[10];
			b[0] = a;
			b[1] = a * 2;
			for(int i = 2; i < 10; i++) {
				if(i % 2 == 1) {
					b[i] = b[i - 1] * 2;
				}else {
					b[i] =  b[i - 1] / 3;
				}
			}
			double sum = 0;
			for(double i : b) {
				sum += i;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
