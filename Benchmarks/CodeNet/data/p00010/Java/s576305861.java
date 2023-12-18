import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static double[] getLine(double x1, double y1, double x2, double y2){
		double[] ans = new double[3];
		double mid_x = (x1 + x2) / 2;
		double mid_y = (y1 + y2) / 2;
		ans[0] = y1 - y2;
		ans[1] = x1 - x2;
		ans[2] = - mid_y * (y1 - y2) - mid_x * (x1 - x2);
		return ans;
	}

	public static void main(String[] args){
		List<Double> listX = new ArrayList<Double>();
		List<Double> listY = new ArrayList<Double>();
		List<Double> listR = new ArrayList<Double>();
		int n = scan.nextInt();
		double[] pt = new double[6];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < pt.length; j++){
				pt[j] = scan.nextDouble();
			}
			double[] l1 = getLine(pt[0], pt[1], pt[2], pt[3]);
			double[] l2 = getLine(pt[0], pt[1], pt[4], pt[5]);

			double x = (l1[0] * l2[2] - l1[2] * l2[0]) /
						(l1[1] * l2[0] - l1[0] * l2[1]);
			double y;
			if(l1[0] != 0){
				y = (l1[1] * x + l1[2]) / - l1[0];
			} else{
				y = (l2[1] * x + l2[2]) / - l2[0];
			}
			double r = Math.sqrt(Math.pow(x - pt[0], 2) +
					Math.pow(y - pt[1], 2));
			listX.add(x);
			listY.add(y);
			listR.add(r);
		}

		Iterator<Double> itX = listX.iterator();
		Iterator<Double> itY = listY.iterator();
		Iterator<Double> itR = listR.iterator();
		while(itX.hasNext()){
			double x = itX.next();
			double y = itY.next();
			double r = itR.next();
			System.out.printf("%.3f %.3f %.3f\n", x, y, r);
		}
	}
}