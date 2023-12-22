import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		double r = Double.parseDouble(sc.next());
		double area = r * r * Math.PI;
		double circ = 2 * r * Math.PI;
		/*
		double pi = 3.1415;
		double area = r * r * pi;
		double circ = 2 * r * pi;
		*/
		BigDecimal bdarea = new BigDecimal(String.valueOf(area));
		BigDecimal bdcirc = new BigDecimal(String.valueOf(circ));

		System.out.println(bdarea.setScale(6,RoundingMode.HALF_UP).toPlainString() + " " + bdcirc.setScale(6,RoundingMode.HALF_UP).toPlainString());
	}
}

