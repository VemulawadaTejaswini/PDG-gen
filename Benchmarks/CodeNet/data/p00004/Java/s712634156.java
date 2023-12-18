import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		while(sc.hasNextInt()){
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			f = sc.nextInt();
			x=(c*e-b*f)/(a*e-b*d);
			y=(f*a-c*d)/(a*e-d*b);
			if(x==-0){
				x=0;
			}
			if(y==-0){
				y=0;
			}
			System.out.printf("%.3f %.3f",x,y);
		}	
	}
}