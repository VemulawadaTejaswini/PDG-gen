import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
			int f=sc.nextInt();
			double det=(double)(a*e-b*d);
			double x=(double)(c*e-b*f)/det;
			double y=(double)(c-a*x)/b;
			System.out.println(new BigDecimal(x).setScale(3, BigDecimal.ROUND_FLOOR)+" "+new BigDecimal(y).setScale(3, BigDecimal.ROUND_HALF_UP));
			//System.out.printf("%.3f %.3f\n",x,y);
		}
sc.close();
	}
}