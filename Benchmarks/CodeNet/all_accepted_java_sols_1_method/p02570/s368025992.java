import java.util.Scanner;


public class Main {

	static String[][]  map;
	static int h;
	static int w;
	static int cnt;

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		double d = Double.parseDouble(sc.next());
		double t = Double.parseDouble(sc.next());
		double s = Double.parseDouble(sc.next());
		

		if(d/s <= t) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		


	}
}