import java.util.Scanner;
public class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double r = sc.nextDouble();
	sc.close();
	System.out.printf("%f %f", r * r* Math.PI, 2 * r * Math.PI);
}
}