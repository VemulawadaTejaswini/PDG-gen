import java.util.Scanner;
import java.math.BigDecimal;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double g = scan.nextDouble();
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			double d = scan.nextDouble();
			double e = scan.nextDouble();
			double f = scan.nextDouble();
			double x = (c*e-b*f)/(g*e-b*d);
			double y = (c*d-g*f)/(b*d-g*e);
			BigDecimal bx = new BigDecimal(String.valueOf(x));
			BigDecimal by = new BigDecimal(String.valueOf(y));
			double outx = bx.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
			if(outx*10 == (int)(outx*10)) System.out.print(outx + "00 ");
			else if(outx*100 == (int)(outx*100)) System.out.print(outx + "0 ");
			else System.out.print(outx + " ");
			double outy = by.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
			if(outy*10 == (int)(outy*10)) System.out.print(outy + "00\n");
			else if(outy*100 == (int)(outy*100)) System.out.print(outy + "0\n");
			else System.out.print(outy + "\n");
		}
	}
}