import java.util.*;
import java.math.*;
public class Main{
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++ ){
			double Ax = sc.nextDouble();
			double Ay = sc.nextDouble();
			double Bx = sc.nextDouble();
		    double By = sc.nextDouble();
		    double Cx = sc.nextDouble();
		    double Cy = sc.nextDouble();
		    double Dx = sc.nextDouble();
		    double Dy = sc.nextDouble();
		    double cross = Math.abs( (Bx - Ax) * (Dy - Cy) - (By - Ay) * (Dx - Cx) );
		    if(cross==0){
		    	System.out.println("YES");
		    }else{
		    	System.out.println("NO");
		    }
		}
	}
}