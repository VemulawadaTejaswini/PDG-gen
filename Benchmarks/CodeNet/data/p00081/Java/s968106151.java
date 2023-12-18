import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("[, \\r\\n]+");
		while(sc.hasNext()){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double xq = sc.nextDouble();
			double yq = sc.nextDouble();

			if(y1 == y2){
				System.out.printf("%1.6f %1.6f\n", xq, yq * -1);
			}
			else if(x1 == x2){
				System.out.printf("%1.6f %1.6f\n", xq * -1, yq);
			}
			else{
				double pa = (y2 - y1) / (x2 - x1);
				double pb = y1 - pa * x1;
				double qa = (double)-1 / pa;
				double qb = yq - qa * xq;
				double midx = (pb - qb) / (qa - pa);
				double midy = pa * midx + pb;
				double ansx = 2 * midx - xq;
				double tes = 2 *( (( y1 - ((y2 - y1) / (x2 - x1)) * x1) - (yq - qa * xq)) / ((-1 * (y2 - y1) / (x2 - x1)) - ( (y2 - y1) / (x2 - x1)))) - xq;
				double ansy = 2 * midy - yq;
				System.out.printf("%1.6f %1.6f\n", ansx,ansy);
			}
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}