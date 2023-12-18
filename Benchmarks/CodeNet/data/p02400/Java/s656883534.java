import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
        double r = stdin.nextDouble();
	double x = Math.PI;
	double s = (double)x*r*r;
	double l = (double)2*x*r;
	System.out.printf("%.6f %.6f %n", s, l);
    }
}

	