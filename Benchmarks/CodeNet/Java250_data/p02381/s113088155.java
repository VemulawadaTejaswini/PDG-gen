import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double[] array = new double[1000];
		int i;
		for(;;){
			double sum = 0;
			double ave;
			double hen = 0;
			double hen_sum = 0;
			int n = scan.nextInt();
			if(n == 0)
				break;
			for(i = 0; i < n; i++){
				double a = scan.nextDouble();
				array[i] = a;
				sum += a;
			}
			ave = sum / n;
			for(i = 0; i < n; i++){
				hen += (ave - array[i]) * (ave - array[i]);
			}
			double v = hen / n;
			double a = Math.sqrt(v);
			System.out.println(a);
		}
	}
}



		

	