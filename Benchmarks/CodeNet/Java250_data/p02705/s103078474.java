import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double R = scn.nextDouble();
		scn.close();
		double ans = 2*R*3.1415926535;
		System.out.println(ans);
	}

}
