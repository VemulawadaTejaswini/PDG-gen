import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			double a = 0;
			double x = sc.nextInt();
			double h = sc.nextInt();
			if(x == 0 && h == 0)break;
			double t=x/2;
			double b=Math.sqrt(h*h+t*t);
			a = (x*x)+(b*x*2);
			System.out.printf("%6f\n",a);
	}
}
}