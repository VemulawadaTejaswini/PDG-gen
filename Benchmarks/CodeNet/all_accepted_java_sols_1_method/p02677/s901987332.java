import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int neL = scan.nextInt();
		int neS = scan.nextInt();
		int hour = scan.nextInt();
		int minute = scan.nextInt();

		System.out.println(Math.sqrt(Math.pow(neL, 2) + Math.pow(neS, 2) - 2 * neS * neL * Math.cos(Math.toRadians(Math.abs(minute*6 - (30 * hour + 0.5 * minute))))));
		scan.close();
	}
}