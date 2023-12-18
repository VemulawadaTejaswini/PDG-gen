import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int price = sc.nextInt();

		if(price % 1000 == 0) {
			System.out.println(0);
		}else {
			int change = 1000 - (price % 1000);

			System.out.println(change);
		}
	}

}