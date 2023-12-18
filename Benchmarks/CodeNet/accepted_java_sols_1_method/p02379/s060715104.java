import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
//		double x1 = Double.parseDouble(args[0]);
//		double y1 = Double.parseDouble(args[1]);
//
//		double x2 = Double.parseDouble(args[2]);
//		double y2 = Double.parseDouble(args[3]);

		double out = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2)+Math.pow(Math.abs(y1 - y2), 2));
		System.out.println(out);
		//x=root(x2+y2)
	}


}

