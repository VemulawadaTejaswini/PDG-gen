import java.util.Scanner;
public class Main {
public static void main(String[]args){
double x = Math.PI;
Scanner s = new Scanner(System.in);

double r = s.nextDouble();
double a = 2 * Math.PI * r;
double b = Math.PI * r * r;
System.out.println( String.format( "%.7f ", b ) + " " + String.format( "%.7f ", a ) );

s.close();

}

}
