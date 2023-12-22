
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Main {
	public static void main(String[] args){
		double r, m, s;
		DecimalFormat t = new DecimalFormat("0.000000");
		t.setRoundingMode(RoundingMode.HALF_UP);
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		m = r * r * 3.141592653589;
		s = (r + r) * 3.141592653589;
		System.out.println(t.format(m) + " " + t.format(s));
	}
}