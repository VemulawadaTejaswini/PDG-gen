import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x[]=new double[20];
		double y[]=new double[20];
		double d[]=new double[19];
		int i,k=0;
		double sum=0;
		while(sc.hasNext()){
			String str[]=sc.next().split(",");
			x[k]=Double.parseDouble(str[0]);
			y[k]=Double.parseDouble(str[1]);
			k++;
		}
		for(i=1;i<k;i++){
			d[i-1]=makeEdge(x[0],y[0],x[i],y[i]);
		}
		for(i=0;i+2<k;i++){
			System.out.println(area(d[i],d[i+1],makeEdge(x[i+1],y[i+1],x[i+2],y[i+2])));
			sum+=area(d[i],d[i+1],makeEdge(x[i+1],y[i+1],x[i+2],y[i+2]));
		}
	}
	public static double makeEdge(double x1,double y1,double x2,double y2){
		double x=x2-x1,y=y2-y1;
		return Math.sqrt(x*x+y*y);
	}
	public static double area(double a,double b,double c){
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}