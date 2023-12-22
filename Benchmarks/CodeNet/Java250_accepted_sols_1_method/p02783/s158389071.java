import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hp = sc.nextInt();
		int attack = sc.nextInt();

		int count = 0;

		count = hp / attack;

		if(hp % attack >= 1) {
			count++;
		}

		System.out.println(count);
	}

}