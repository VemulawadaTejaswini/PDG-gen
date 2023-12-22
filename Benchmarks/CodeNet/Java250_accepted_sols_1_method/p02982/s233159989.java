import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		   int n = sc.nextInt();
		   int d = sc.nextInt();
		   List<double[]> x_list = new ArrayList<double[]>();
		   for(int i=0; i<n; i++) {
			   double[] x_d = new double[d];
			   for(int j=0; j<d; j++) {
				   x_d[j] = sc.nextDouble();
			   }
			   x_list.add(x_d);
		   }

		   int cnt=0;
		   for(int i=0;i<n-1;i++) {
			   double[] x_d_i = x_list.get(i);
			   for(int j=i+1;j<n;j++) {
				   double[] x_d_j = x_list.get(j);
				   double cal = 0;
				   for(int k=0; k<d; k++) {
					   cal += (x_d_i[k]-x_d_j[k])*(x_d_i[k]-x_d_j[k]);
				   }
				   double distance = Math.sqrt(cal);
				   if(distance == (int)distance) {
					   cnt += 1;
				   }
			   }
		   }
		   System.out.println(cnt);

		    sc.close();
	}
}