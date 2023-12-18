import java.util.*;
import java.awt.geom.*;
public class Main {
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String [] a = sc.next().split(",");
			double w = Double.parseDouble(a[1]);
			double h = Double.parseDouble(a[2]);
			double res = w / (h * h);
			if(res >= 25){
				System.out.println(a[0]);
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}