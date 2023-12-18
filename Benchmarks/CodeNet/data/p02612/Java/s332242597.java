import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		
		int payment = 0;
		while(payment < price) {
			payment += 1000;
		}
		
		System.out.println(payment - price);
	}
}