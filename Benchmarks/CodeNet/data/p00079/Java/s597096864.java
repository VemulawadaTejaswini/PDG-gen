import java.awt.geom.Point2D;
import java.util.*;
public class Main {

	private double getS(double a, double b, double c){

		double z = (a + b + c) / 2;
		double s = z * (z - a) * (z - b) * (z - c);
		s = Math.sqrt(s);
		return s;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("[, \\r\\n]+");
		ArrayList<Point2D> list = new ArrayList<Point2D>();
		while(sc.hasNext()){
			list.add(new Point2D.Double(sc.nextDouble(), sc.nextDouble()));
		}
		double sum =0;
		int len = list.size();
		Point2D start = list.get(0);
		for(int i=1; i < len; i++ ){
			sum += getS(list.get(i).distance(start), list.get((i+1) % len).distance(start), list.get((i+1) % len).distance(list.get(i)));
		}
		System.out.printf("%1.6f\n",sum);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}