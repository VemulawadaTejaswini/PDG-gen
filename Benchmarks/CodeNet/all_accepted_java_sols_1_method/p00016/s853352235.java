import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		double x = 0.0;
		double y = 0.0;
		double d = 90.0;
		
		String str = "";
		while ((str = sc.nextLine()).equals("0,0") == false) {
			String[] params = str.split(",");
			
			int meter = Integer.parseInt(params[0]);
			int degree = Integer.parseInt(params[1]);
			
			x = x + meter * Math.cos(Math.toRadians(d));
			y = y + meter * Math.sin(Math.toRadians(d));
			d = d - degree;
		}

		System.out.println((int)x);
		System.out.println((int)y);
	}
}