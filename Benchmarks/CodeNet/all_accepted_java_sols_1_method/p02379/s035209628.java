import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		double x1=scan.nextDouble();
		double y1=scan.nextDouble();
		double x2=scan.nextDouble();
		double y2=scan.nextDouble();
		double x=Math.abs(x1-x2)*Math.abs(x1-x2);
		double y=Math.abs(y1-y2)*Math.abs(y1-y2);
		System.out.println(Math.sqrt(x+y));
	}
}
