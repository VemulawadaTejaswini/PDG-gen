//£ðßévO
import java.util.*;
import java.math.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x = Math.abs(x1 - x2);
		double y = Math.abs(y1 - y2);
		double z = Math.sqrt(x*x + y*y);
		System.out.printf("%1.8f",z);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}