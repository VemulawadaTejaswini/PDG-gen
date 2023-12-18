import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double a=sc.nextInt();
			double b=sc.nextInt();
			double c=sc.nextInt();
			double d=sc.nextInt();
			double e=sc.nextInt();
			double f=sc.nextInt();
			double y=(c*d-a*f)/(b*d-a*e);
			double x=(c-b*y)/a;
			System.out.printf("%.3f %.3f\n",x,y);
		}
	}
}