import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		boolean canBuy = false;

		for (int i=0; (i*4)<=N ;i++){
			int remain = N -(i*4);
			if (remain % 7 == 0){
				canBuy = true;
				break;
			}
		}
		if (canBuy){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}