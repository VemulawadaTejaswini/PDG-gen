import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] t = sc.nextLine().split(" ");
		int  d = Integer.parseInt(t[0]);
		int  p = Integer.parseInt(t[1]);
		double  s = Double.parseDouble(t[2]);


		double x = d / s;

		String y;
		if(x > p) {
			y = "No";
		}else {
			y = "Yes";
		}

		System.out.println(y);
	}
}
