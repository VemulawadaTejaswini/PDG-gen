import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double a = sc.nextDouble();double b = sc.nextDouble();double c = sc.nextDouble();
			double d = sc.nextDouble();double e = sc.nextDouble();double f = sc.nextDouble();
			double sum1 = 0.0;double sum2 = 0.0;
			double x = 0.0;double y = 0.0;
			if(a>d && 0>d){
				sum1 = (b*(-d) + e*a);
				sum2 = (c*(-d) + f*a);
				y = sum2 / sum1;
				x = (c - b*y)/a;
			}else if(a>d && d>0){
				sum1 = (b*d + e*(-a));
				sum2 = (c*d + f*(-a));
				y = sum2 / sum1;
				x = (c - b*y)/a;
			}else if(a<d && 0>a){
				sum1 = (b*d + e*a);
				sum2 = (c*d + f*a);
				y = sum2 / sum1;
				x = (c - b*y)/a;
			}else if(a<d && 0<a){
				sum1 = (b*d + e*(-a));
				sum2 = (c*d + f*(-a));
				y = sum2 / sum1;
				x = (c - b*y)/a;
			}else if(a == d){
				sum1 = b - e;
				sum2 = c - f;
				y = sum2 / sum1;
				x = (c - b*y)/a;
			}else if(a == -d || -a == d){
				sum1 = b + e;
				sum2 = c + f;
				y = sum2 / sum1;
				x = (c - b*y)/a;
			}
			System.out.printf("%.3f %.3f",x,y);
		}
	}
}