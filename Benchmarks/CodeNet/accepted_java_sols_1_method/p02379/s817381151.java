import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		double l=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
		System.out.printf("%.8f\n",Math.sqrt(l));
	}
}