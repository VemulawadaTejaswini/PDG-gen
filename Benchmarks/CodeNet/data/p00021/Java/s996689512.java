import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			double x1=sc.nextDouble();
			double y1=sc.nextDouble();
			double x2=sc.nextDouble();
			double y2=sc.nextDouble();
			double x3=sc.nextDouble();
			double y3=sc.nextDouble();
			double x4=sc.nextDouble();
			double y4=sc.nextDouble();
			if(x1>x2){
				double box=x1;
				x1=x2;
				x2=box;
				box=y1;
				y1=y2;
				y2=box;
			}
			if(x3>x4){
				double box=x3;
				x3=x4;
				x4=box;
				box=y3;
				y3=y4;
				y4=box;
			}
			double d1=(y2-y1)/(x2-x1);
            double d2=(y4-y3)/(x4-x3);
			if(d1==d2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}