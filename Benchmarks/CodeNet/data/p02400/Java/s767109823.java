import java.util.Scanner;

public class Main{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double x= sc.nextInt();
	double a=2*Math.PI*x;
	double b=Math.PI*x*x;
	System.out.println(String.format("%1$.6f", a)+" "+String.format("%1$.6f", b));
}
}

