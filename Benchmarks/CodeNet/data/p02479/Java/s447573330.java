import java.util.*;
import java.lang.Math;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.printf("%f  %f\n",r*r*Math.PI ,r*2*Math.PI );
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}