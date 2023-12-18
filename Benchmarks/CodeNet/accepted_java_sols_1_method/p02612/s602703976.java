import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int itemPrice = scan.nextInt();
		while(itemPrice>0) {
			itemPrice-=1000;
		}
		System.out.println(Math.abs(itemPrice));

	}

}