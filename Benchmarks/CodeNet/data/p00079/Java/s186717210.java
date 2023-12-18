import java.awt.geom.Point2D;
import java.util.*;
public class Main {

	private double getS(double x1, double y1, double x2, double y2){
		double s = x1 * y2 - y1 * x2;
		s = s / 2;
		return s;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("[, \\r\\n]+");

		ArrayList<Point2D> list = new ArrayList<Point2D>();
		Point2D.Double start = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
		while(sc.hasNext()){
			double x = sc.nextDouble() - start.getX();
			double y = sc.nextDouble() - start.getY();
			list.add(new Point2D.Double(x, y));
		}
		list.add(start);
		double sum =0;
		int len = list.size();
		for(int i=0; i < len-1; i++ ){
			double result = getS(list.get(i).getX(), list.get(i).getY(), list.get(i+1).getX(), list.get(i+1).getY());
			sum += result;
		}
		System.out.printf("%1.6f\n",Math.abs(sum));
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}