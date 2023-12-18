import java.util.*;

class Main{
    public static final double PI = 3.1415926535;
    public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	double r = s.nextDouble();
	double area = r * r * PI;
	double circle = 2 * r * PI;
	
	System.out.printf("%6f %6f\n", area, circle);
    }
}