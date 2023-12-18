import java.util.Scanner;
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
			double x=(c*e-b*f)/(a*e-d*b);
			double y=(c-a*x)/b;
			System.out.printf("%.3f %.3f\n",x,y);
		}
		sc.close();
	}
}