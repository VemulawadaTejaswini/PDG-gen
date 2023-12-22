import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = Double.parseDouble(sc.next());

		double s = Math.PI * r * r;
		double l = 2 * Math.PI * r;

		System.out.print(String.format("%.06f %.06f",s,l));
	}
}