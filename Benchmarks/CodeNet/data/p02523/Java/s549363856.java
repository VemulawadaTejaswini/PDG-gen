import java.util.Scanner;
public class Main {
	static int count = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		String[] s = sc2.nextLine().split("[\\s]+");
		double x = Double.parseDouble(s[0]) - Double.parseDouble(s[2]);
		double y = Double.parseDouble(s[1]) - Double.parseDouble(s[3]);
		System.out.println(Math.sqrt(x*x+y*y));
	}
}