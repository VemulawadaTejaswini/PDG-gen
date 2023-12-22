import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double eps = 0.0000000000001;
		int N = cin.nextInt();
		while(N--!=0){
			double x1 = cin.nextDouble();
			double y1 = cin.nextDouble();
			double x2 = cin.nextDouble();
			double y2 = cin.nextDouble();
			double x3 = cin.nextDouble();
			double y3 = cin.nextDouble();
			double x4 = cin.nextDouble();
			double y4 = cin.nextDouble();
			if(x2-x1 + eps >= 0 && x2-x1-eps <= 0){
				if(x4-x3 + eps >= 0 && x4-x3-eps <= 0){
					System.out.println("YES");
					continue;
				}
			}
			double d1 = (y2-y1)/(x2-x1);
			double d2 = (y4-y3)/(x4-x3);
			if(d1+eps >= d2 && d1-eps <= d2){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}

}