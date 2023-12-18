import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
        double PI = Math.PI;
	double r = s.nextDouble();
	double area = r * r * PI;
	double circle = 2.0 * r * PI;
	System.out.printf("%6f %6f\n", area, circle);
    }
}