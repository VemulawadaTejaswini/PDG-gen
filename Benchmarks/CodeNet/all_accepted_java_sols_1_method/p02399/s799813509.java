import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double a = sc.nextInt();
	double  b = sc.nextInt();
	double  d = a / b;
	double r = a % b;

	System.out.print((int)d+" "+(int)r+" ");
	System.out.printf("%f\n", d );
	
	}

}