import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		double x1,y1,x2,y2,x3,y3,x4,y4;
		int n=scanner.nextInt();
		for(int i=0;i<n;i++){
			x1=scanner.nextDouble();
			y1=scanner.nextDouble();
			x2=scanner.nextDouble();
			y2=scanner.nextDouble();
			x3=scanner.nextDouble();
			y3=scanner.nextDouble();
			x4=scanner.nextDouble();
			y4=scanner.nextDouble();
			double m1=(y1-y2)/(x1-x2);
			double m2=(y3-y4)/(x3-x4);
			if(m1==m2) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}