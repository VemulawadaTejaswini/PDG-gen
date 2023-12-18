import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		System.out.println(a*b*Math.sin(c*Math.PI/180.0)/2);
		System.out.println(a+b+Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(c*Math.PI/180.0)));
		System.out.println(b*Math.sin(c*Math.PI/180.0));
    }
}
