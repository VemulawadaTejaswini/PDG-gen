import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	void run() {
		double arg = 0;
		double len = 0;
		double x = 0;
		double y = 0;
		while (true) {
			String[] str = sc.next().split(",");
			if (str[0].equals("0") && str[1].equals("0")) break;
			len = Double.parseDouble(str[0]);
			x += len * Math.sin(arg/180*Math.PI);
			y += len * Math.cos(arg/180*Math.PI);
			arg += Double.parseDouble(str[1]);
		}
		System.out.println((int)(x-0.5));
		System.out.println((int)(y-0.5));
	}
	public static void main(String[] args) {
		new Main().run();
	}
}