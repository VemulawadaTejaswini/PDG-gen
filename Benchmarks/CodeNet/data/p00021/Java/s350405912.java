import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++){
			/*double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double x4 = sc.nextDouble();
			double y4 = sc.nextDouble();
			
			double slope_1 = (y2 - y1) / (x2 - x1);
			double slope_2 = (y4 - y3) / (x4 - x3);*/
			
			double[] p = new double[8];
			// 座標入力
			for (int j = 0; j < 8; j++) {
				p[j] = sc.nextDouble();
			}

			// 傾き
			double a1 = (p[3] - p[1]) / (p[2] - p[0]);
			double a2 = (p[7] - p[5]) / (p[6] - p[4]);

			
			if(a1 == a2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}