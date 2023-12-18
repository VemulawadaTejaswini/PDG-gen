import java.util.*;

class Main{
    public static final double PI = 3.1415926535;
    public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	double r = s.nextDouble();

	System.out.println(r * r * PI + " " + 2 * r * PI);
    }
}