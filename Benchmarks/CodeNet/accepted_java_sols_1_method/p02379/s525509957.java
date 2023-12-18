import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		//System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		double x1 =scan.nextDouble();
		double y1 =scan.nextDouble();
		double x2 =scan.nextDouble();
		double y2 =scan.nextDouble();
		double keisan =0.0;
		keisan = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println(keisan);
	}
}