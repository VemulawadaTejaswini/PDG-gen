import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	double r = s.nextDouble();

	String area = String.format("%.6f", r * r * Math.PI);
	String peri = String.format("%.6f", 2 * r * Math.PI);
	System.out.println(area+" "+peri);
    }
}

