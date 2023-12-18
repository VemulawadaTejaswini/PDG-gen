import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i;
		double sum_1 = 0;
		double sum_2 = 0;
		double sum_3 = 0;
		double sum_4 = 0;
		double array_x[] = new double[1000];
		double array_y[] = new double[1000];
		for(i = 0; i < n; i++){
			array_x[i] = scan.nextDouble();
		}
		for(i = 0; i < n; i++){
			array_y[i] = scan.nextDouble();
		}
		for(i = 0; i < n; i++){
			sum_1 += Math.abs(array_x[i] - array_y[i]);
		}
		for(i = 0; i < n; i++){
			sum_2 += Math.sqrt(Math.abs(array_x[i] - array_y[i]) * Math.abs(array_x[i] - array_y[i]));
		}
		for(i = 0; i < n; i++){
			sum_3 += Math.cbrt(Math.abs(array_x[i] - array_y[i]) * Math.abs(array_x[i] - array_y[i]) * Math.abs(array_x[i] - array_y[i]));
		}
		sum_4 = Math.abs(array_x[0] - array_y[0]) + Math.abs(array_x[n] - array_y[n]);
		System.out.println(sum_1);
		System.out.println(sum_2);
		System.out.println(sum_3);
		System.out.println(sum_4);
	}
}



		

	