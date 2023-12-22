import java.util.Scanner;
 class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double px,py,r;
		for(int i=0;i<n;i++){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			px=((2*(y2-y1))*(x1*x1-x3*x3+y1*y1-y3*y3)-(2*(y3-y1))*(x1*x1-x2*x2+y1*y1-y2*y2))/((2*(x2-x1))*(2*(y3-y1))-(2*(x3-x1))*(2*(y2-y1)));
			py=((x1*x1-x2*x2+y1*y1-y2*y2)*(2*(x3-x1))-(x1*x1-x3*x3+y1*y1-y3*y3)*(2*(x2-x1)))/((2*(x2-x1))*(2*(y3-y1))-(2*(x3-x1))*(2*(y2-y1)));
			r=Math.sqrt((x1-px)*(x1-px)+(y1-py)*(y1-py));
			System.out.printf("%.3f %.3f %.3f\n",px,py,r);
		}
	}
}