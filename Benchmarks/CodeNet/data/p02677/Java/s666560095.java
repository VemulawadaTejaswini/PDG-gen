

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		int jiaoduH = h*360/12;
		int jiaoduM = m*360/60;
		int jiaodu = Math.abs(jiaoduM -jiaoduH);
		if (jiaodu > 180) {
			jiaodu = 360-jiaodu;
		}
		Double c = a*a + b*b - 2*a*b*Math.cos(jiaodu* (Math.PI)/180 );
		System.out.println(Math.sqrt(c));
	}

}
