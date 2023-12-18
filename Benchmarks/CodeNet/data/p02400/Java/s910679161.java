import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		String r = scan.next();

		System.out.println((Double.parseDouble(r) * 2) * Math.PI + " " + (Double.parseDouble(r)+2) * Math.PI);


		scan.close();

	}
}