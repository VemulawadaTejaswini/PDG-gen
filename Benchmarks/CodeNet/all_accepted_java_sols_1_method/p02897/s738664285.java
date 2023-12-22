import java.util.*;

public class Main {
	public  static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a = sc.nextInt();
	double b = 1/a;
	double c = Math.ceil(a/2);
	double d = b * c;

	System.out.println( d );
	}
}