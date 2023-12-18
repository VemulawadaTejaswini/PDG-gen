import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1  = scan.nextInt();
		int num2 = scan.nextInt();
		int diff = num2 - num1;
		int heightWest = ((diff -1)/2)*(2 + (diff -2));
		int snow = heightWest - num1;
		if (snow < 1) snow = 1;
		System.out.println(snow);
	}

}