import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		while(sc.hasNext()){
			new aoj0055().doIt();
		}
	}
	class aoj0055{
		void doIt() {
			double a[] = new double[10];
			a[0] = sc.nextDouble();
			double sum = a[0];
			for(int i = 1;i < 10;i++){
				if(i % 2 == 1) a[i] = a[i - 1] * 2;
				else a[i] = a[i - 1] / 3;
				sum = sum + a[i];
			}
			System.out.println(sum);
		}
	}
}