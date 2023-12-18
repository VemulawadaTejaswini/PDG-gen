import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++){
			double x1=in.nextDouble();
			double y1=in.nextDouble();
			double x2=in.nextDouble();
			double y2=in.nextDouble();
			double x3=in.nextDouble();
			double y3=in.nextDouble();
			double x4=in.nextDouble();
			double y4=in.nextDouble();
			if((y1-y2)*(x3-x4)==(x1-x2)*(y3-y4)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}