import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double ans =(double) r * (double) r * Math.PI;
		double syu =(double) 2 *(double) r * Math.PI;
		System.out.println(String.format("%.6f %.6f",ans, syu));

	}

}