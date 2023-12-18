import java.util.*;

class Main{
    private static final double PI = Math.PI;
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
	double r;
	r = s.nextDouble();
	System.out.printf("%6d %6d\n",r*r*PI,2.0 * r * PI);
    }
}