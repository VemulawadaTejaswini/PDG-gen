import java.util.Scanner;


public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String[] s = sc.nextLine().split("[\\s]+");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			int d = Integer.parseInt(s[3]);
			int e = Integer.parseInt(s[4]);
			int f = Integer.parseInt(s[5]);

			double x=(c*e-b*f)/(double)(a*e-b*d);
			double y=(c*d-a*f)/(double)(b*d-a*e);
			if(-0.0004<x&&x<=0)x=0;
			if(-0.0004<y&&y<=0)y=0;
			System.out.printf("%4.3f %4.3f",x,y);
		}
	}
}