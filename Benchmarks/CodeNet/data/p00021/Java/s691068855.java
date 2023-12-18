import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<String> list = new ArrayList<String>();

		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			double x1 = scan.nextDouble();
			double y1 = scan.nextDouble();
			double x2 = scan.nextDouble();
			double y2 = scan.nextDouble();
			double x3 = scan.nextDouble();
			double y3 = scan.nextDouble();
			double x4 = scan.nextDouble();
			double y4 = scan.nextDouble();
			
			double theta = Math.abs(x2 - x1) * Math.tan(Math.abs(y2 - y1)
							 / Math.abs(x2 - x1));
			double thetaB = Math.abs(x4 - x3) * Math.tan(Math.abs(y4 - y3)
							 / Math.abs(x4 - x3));
			if(theta == thetaB){
				list.add("YES");
			} else{
				list.add("NO");
			}
		}

		for(String s : list){
			System.out.printf("%s\n", s);
		}
	}
}