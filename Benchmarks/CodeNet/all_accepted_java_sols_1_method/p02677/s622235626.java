import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = Double.parseDouble(sc.next());
		double B = Double.parseDouble(sc.next());
		double H = Double.parseDouble(sc.next());
		double M = Double.parseDouble(sc.next());
		sc.close();

		double degree = 0;
		double shortDegree = (H * 60 + M) * 0.5;
		double longDegree =  M * 6;
		if(Math.abs(longDegree - shortDegree) <= 180) {
			degree = Math.abs(longDegree - shortDegree);
		}else {
			degree = 360 - Math.abs(longDegree - shortDegree);
		}

		double r=Math.sqrt(Math.pow(A,2)+Math.pow(B,2)-2*A*B*Math.cos(Math.toRadians(degree)));
		System.out.println(String.format("%.15f", r));
	}

}