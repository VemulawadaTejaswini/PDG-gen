import java.util.Scanner;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1,y1,x2,y2,X,Y,dis;
		String str;
		
		Scanner as = new Scanner(System.in);
		
		x1 = as.nextDouble();
		y1 = as.nextDouble();
		x2 = as.nextDouble();
		y2 = as.nextDouble();
		
		X = x1 - x2;
		Y = y1 - y2;
		
		dis = Math.sqrt((X*X)+(Y*Y));
		
		str = String.valueOf(dis);
		System.out.println(str);

	}

}