import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner scan01 = new Scanner(System.in);
		int num = scan01.nextInt();
		scan01.close();

		int mult = num*2;

		double circle= mult * 3.14;

		System.out.println(circle);
	}
}
