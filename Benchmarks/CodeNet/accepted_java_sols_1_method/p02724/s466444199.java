import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int point = 0;

		point = x/500;
		x = x-500*point;
		point*=1000;
		point += (x/5)*5;
		System.out.println(point);
	}

}