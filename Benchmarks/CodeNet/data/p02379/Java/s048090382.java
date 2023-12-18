import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] distance = str.split(" ");
		double x = Math.abs(Double.parseDouble(distance[0]) - Double.parseDouble(distance[2]));
		double y = Math.abs(Double.parseDouble(distance[1]) - Double.parseDouble(distance[3]));
		double ans = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);
		System.out.printf("%.8f",ans);
		

	}

}