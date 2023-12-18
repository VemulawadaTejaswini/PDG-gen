import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		double a=0;
		if(x1>x2) {
			if(y1>y2) {
				a=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
			}
			else  {
				a=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y2-y1, 2));
			}
		}
			else {
				if(y1>y2) {
					a=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y1-y2, 2));
				}
				else {
					a=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
				}
			}
		System.out.println(a);
		sc.close();
		}

	}
