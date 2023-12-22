import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{
	Scanner sc = new Scanner(System.in);
	double r;
	double cir,area;

	r = Double.parseDouble(sc.next());
	cir = 2*Math.PI*r;
	area = Math.PI*r*r;

	System.out.printf("%.6f %.6f", area,cir);
	sc.close();
	}
}