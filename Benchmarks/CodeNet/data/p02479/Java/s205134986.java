import java.util.Scanner;
public class Sc3 {
public static void main(String[] args) {

double pi = Math.PI;
Scanner sc = new Scanner(System.in);

double a = sc.nextDouble();


double area = pi*a*a;
double length = 2*a*pi;

System.out.printf("%f ",area);
System.out.printf("%f%n",length);

}
}