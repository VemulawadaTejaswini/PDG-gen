import java.util.Scanner;

//A Symmetric Point
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] s = sc.next().split(",");
			double x1 = Double.parseDouble(s[0]);
			double y1 = Double.parseDouble(s[1]);
			double x2 = Double.parseDouble(s[2]);
			double y2 = Double.parseDouble(s[3]);
			double x3 = Double.parseDouble(s[4]);
			double y3 = Double.parseDouble(s[5]);
			double px = x2-x1;
			double py = y2-y1;
			double qx = x3-x1;
			double qy = y3-y1;
			double thita = Math.acos((px*qx+py*qy)/(Math.sqrt(px*px+py*py)*Math.sqrt(qx*qx+qy*qy)));
			double rx = Math.cos(-2*thita)*qx - Math.sin(-2*thita)*qy;
			double ry = Math.sin(-2*thita)*qx + Math.cos(-2*thita)*qy;
			x1+=rx;
			y1+=ry;
			System.out.println(x1+" "+y1);
		}
	}
}