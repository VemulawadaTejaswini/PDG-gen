import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double q = scan.nextDouble();
			if(q == -1){
				break;
			}
			double x = q / 2.0;
			double y = 0;
			while(true){
				y = x*x*x - q;
				if(y < 0.00001*q && y > -0.00001*q){
					break;
				}
				x = x - y / (3 * x * x);
			}
			System.out.printf("%.6f\n",x);
		}
	}
}