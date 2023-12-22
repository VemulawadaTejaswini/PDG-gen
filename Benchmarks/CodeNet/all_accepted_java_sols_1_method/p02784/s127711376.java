import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int hp = sc.nextInt();
		int attackType = sc.nextInt();
		for(int i =0;i < attackType; i++) {
			hp -= sc.nextInt();
			if(hp <= 0) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}