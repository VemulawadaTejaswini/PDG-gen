import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	double r = in.nextDouble();

	System.out.printf("%.6f %.6f\n" ,Math.PI*r*r ,2*Math.PI*r);
    }
}