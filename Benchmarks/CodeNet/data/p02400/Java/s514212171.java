import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		double men = Math.PI * r * r;
		double ens = 2 * Math.PI * r;
		System.out.println(String.format("%.6f", men)+
				 " " + String.format("%.6f", ens));

	}

}