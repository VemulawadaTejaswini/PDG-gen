import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		double[] x = new double[3];
		double[] y = new double[3];

		while(scan.hasNext()){
			double S_abc, S_pab, S_pac, S_pbc;
			for(int i = 0; i < 3; i++){
				x[i] = scan.nextDouble();
				y[i] = scan.nextDouble();
			}
			double xp = scan.nextDouble();
			double yp = scan.nextDouble();
			
			S_abc = 1.0 / 2.0 * Math.abs(x[0]*y[1] + x[1]*y[2] + x[2]*y[0]
					- y[0]*x[1] - y[1]*x[2] - y[2]*x[0]);
			S_pab = 1.0 / 2.0 * Math.abs(xp*y[0] + x[0]*y[1] + x[1]*yp
					- yp*x[0] - y[0]*x[1] - y[1]*xp);
			S_pac = 1.0 / 2.0 * Math.abs(xp*y[0] + x[0]*y[2] + x[2]*yp
					- yp*x[0] - y[0]*x[2] - y[2]*xp);
			S_pbc = 1.0 / 2.0 * Math.abs(xp*y[1] + x[1]*y[2] + x[2]*yp
					- yp*x[1] - y[1]*x[2] - y[2]*xp);
			if(S_abc == S_pab + S_pac + S_pbc){
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