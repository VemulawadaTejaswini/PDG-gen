import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int x=cin.nextInt();
			int h=cin.nextInt();
			if(x+h==0){
				break;
			}
			double hen = Math.sqrt(Math.pow((double)x*Math.sqrt(2)/2.0, 2) + Math.pow(h, 2));
			double a =  Math.sqrt(Math.pow(hen, 2) - Math.pow((double)x/2.0, 2));
			double tri = (double)x*a/2.0;
			System.out.printf("%.6f\n", tri*4+x*x);
		}
	}

}