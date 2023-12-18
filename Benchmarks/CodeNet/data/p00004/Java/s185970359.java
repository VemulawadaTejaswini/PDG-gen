import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();

			b *= d;
			e *= a;
			c *= d;
			f *= a;
			double y = (double)(c-f) / (b - e);
			double x = ((double)c - (y * b)) / (a * d);
			if(x == -0.0){
				x = 0.0;
			}
			System.out.printf("%1.3f %1.3f\n", x, y);
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}