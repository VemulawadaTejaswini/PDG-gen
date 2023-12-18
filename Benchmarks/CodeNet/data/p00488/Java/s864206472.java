import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] price = new int[5];
		for(int i=0; i<price.length; i++) {
			price[i] = sc.nextInt();
		}
		int low_pst = 0, low_drk, best_price = 0;
		int min = price[0];
		for(int i=0; i<3; i++) {
			if(price[i] < min) {
				low_pst = price[i];
			}
		}
		if(price[3] < price[4]) {
			low_drk = price[3];
		} else {
			low_drk = price[4];
		}
		best_price = low_pst + low_drk - 50;
		System.out.println(best_price);
	}
}