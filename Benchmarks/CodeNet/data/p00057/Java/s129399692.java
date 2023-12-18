import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();	
	}

	public Main() {
		while(sc.hasNext()){
			new aoj0057().doIt();
		}
	}
	class aoj0057 {
		int a[] = new int [10001];
		void DP(){
			a[0] = 1;
			for(int i = 1;i <= 10000;i++)a[i] = a[i-1] + i;
		}
		void doIt() {
			DP();
			int n = sc.nextInt();
			System.out.println(a[n]);
		}
	}
}