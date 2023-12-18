import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		double x1 = Double.parseDouble(std.next());
		double y1 = Double.parseDouble(std.next());
		double x2 = Double.parseDouble(std.next());
		double y2 = Double.parseDouble(std.next());
		double res = Math.pow(Math.pow((x1-x2),2) + Math.pow((y1-y2),2),0.5);
		System.out.println(String.format("%.5f", res));
	}
}