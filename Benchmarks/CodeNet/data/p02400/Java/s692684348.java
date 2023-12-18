import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	double r = scanner.nextInt();
    	double x = 3.1416;
    	double y = 2*x*r;
    	double z = x*r*r;
    	System.out.println(String.format("%.5f",y)+" "+String.format("%.5f",z));
    }
}