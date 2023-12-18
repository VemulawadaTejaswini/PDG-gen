import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	double r = sc.nextDouble();
	System.out.println(Math.PI);

	double area = Math.PI * r * r;
	double around = 2 * Math.PI * r;

	System.out.println(area + " " + around); 
	sc.close();
	
    }

}