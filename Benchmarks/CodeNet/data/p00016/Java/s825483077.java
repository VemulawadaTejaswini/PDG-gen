import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double y = 0;
		int th = 90;
		while(sc.hasNext()) {
			String s = sc.next();
			String[] t = s.split(",");
			int d = Integer.parseInt(t[0]);
			int a = Integer.parseInt(t[1]);
			if(d == 0 && a == 0) break;
			x += d * Math.cos((double)th * Math.PI / 180);
			y += d * Math.sin((double)th * Math.PI / 180);
			th -= a;
		}
		System.out.println((int)x);
		System.out.println((int)y);
		sc.close();
	}
}

