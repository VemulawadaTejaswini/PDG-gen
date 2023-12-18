import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
        int r = stdin.nextInt();
	double x = Math.PI;
	double s = (double)x*r*r;
	double l = (double)2*x*r;
	System.out.printf("%.5f %.5f %n", s, l);
    }
}

	