import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double r, l, s;
		
		r = sc.nextDouble();
		
		l = 2 * r * Math.PI;
		s = r * r * Math.PI;
		
		System.out.printf("%.5f %.5f\n", s, l);
	}
}