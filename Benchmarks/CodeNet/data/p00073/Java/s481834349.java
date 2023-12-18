
import java.util.*;
import java.awt.geom.*;
public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int x = sc.nextInt();
			int h = sc.nextInt();
			if((x|h) == 0) break;
			double areaxx = x * x;
			double b = (double)x / 2; 
			double c = Math.sqrt(b * b + h * h);
			double tri = x * c / 2 * 4;
			double res = areaxx + tri;
			System.out.printf("%.6f\n",res);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}