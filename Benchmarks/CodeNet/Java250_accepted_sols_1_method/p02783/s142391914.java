import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int hp = sc.nextInt();
		int attack = sc.nextInt();

		while(hp > 0) {
			hp -= attack;
			answer++;
		}

		System.out.println(answer);
	}
}