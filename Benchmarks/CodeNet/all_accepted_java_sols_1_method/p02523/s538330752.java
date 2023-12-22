import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		double a,b,c,d;
		a=s.nextDouble();
		b=s.nextDouble();
		c=s.nextDouble();
		d=s.nextDouble();
		System.out.printf("%f",Math.sqrt(Math.pow(c-a, 2)+Math.pow(d-b,2)));
	}
}