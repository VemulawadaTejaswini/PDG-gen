import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	double x1,y1,x2,y2,X,Y;
	x1=cin.nextDouble();
	y1=cin.nextDouble();
	x2=cin.nextDouble();
	y2=cin.nextDouble();
	X=x2-x1;
	Y=y2-y1;
	System.out.println(Math.sqrt(X*X+Y*Y));
	}

}