import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextDouble()){
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			double c=sc.nextDouble();
			double d=sc.nextDouble();
			double e=sc.nextDouble();
			double f=sc.nextDouble();
			double x=(c*e-b*f)/(e*a-b*d);
			double y=(c-a*x)/b;
		if(x==-0){
			x=0;
		}else if(y==-0){
			y=0;
		}
		System.out.printf("%.3f %.3f\n",x,y);


		}




	}
}