import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			double c = sc.nextInt();
			double d,e,f;
			c = c * Math.PI / 180;
			d = a * b * Math.sin(c) / 2;
			e = a + b + Math.sqrt(Math.pow(a*Math.sin(c),2)+Math.pow(b-a*Math.cos(c), 2));
			f = b * Math.sin(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
	}

}