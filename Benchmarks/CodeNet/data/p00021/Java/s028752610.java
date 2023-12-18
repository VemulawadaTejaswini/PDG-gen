import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double x4 = sc.nextDouble();
			double y4 = sc.nextDouble();
			
			//double slope_1 = (y2 - y1) / (x2 - x1);
			//double slope_2 = (y4 - y3) / (x4 - x3);
			
			double slope_1 = (y1 - y2) / (x1 - x2);
			double slope_2 = (y3 - y4) / (x3 - x4);
			
			if(slope_1 == slope_2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}