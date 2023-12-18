import java.util.Scanner;



public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		double x3 = 0;
		double y3 = 0;
		double xp = 0;
		double yp = 0;


		while(scan.hasNextDouble()){
			x1 = scan.nextDouble();
			y1 = scan.nextDouble();
			x2 = scan.nextDouble();
			y2 = scan.nextDouble();
			x3 = scan.nextDouble();
			y3 = scan.nextDouble();
			xp = scan.nextDouble();
			yp = scan.nextDouble();

			double j12 = judge(x1, y1, x2, y2, xp, yp);
			double j23 = judge(x2, y2, x3, y3, xp, yp);
			double j31 = judge(x3, y3, x1, y1, xp, yp);

			if((j12>0 && j23>0 && j31>0) || (j12<0 && j23<0 && j31<0)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

		}

	}

	static double judge(double x1 ,double y1, double x2, double y2, double xp, double yp){
		return ( (y2-y1)*xp + (x1-x2)*yp + x2*y1 - x1*y2);
	}

}