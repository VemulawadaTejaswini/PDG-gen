import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		double o = 0, sum = 0, ave = 0;
		double points[] = new double[1000];
		
		while((num = sc.nextInt()) != 0) {
			for(int i = 0; i < num; i++) {
				points[i] = sc.nextInt();
				sum += points[i];
			}
			ave = sum / (double)num;
			for(int i = 0; i < num; i++) {
				o += (ave - points[i])*(ave - points[i]);
			}
			System.out.printf("%.8f\n", Math.sqrt(o / (double)num));
			sum = 0;
			o = 0;
		}
	}
}
