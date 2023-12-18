import java.util.Scanner;
public class Main{
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = Math.toRadians(sc.nextDouble());


        double S,L,h;
        S  = a*b*Math.sin(c)/2;
        L = a+b+Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)-(2*a*b+Math.cos(c)));
        h = 2*S/a;


        System.out.printf("%f\n%f\n%f\n",S,L,h);

        sc.close();
	}


}

