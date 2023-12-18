
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice();
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();
		int x4 = sc.nextInt();
		int x5 = sc.nextInt();
		int x6 = sc.nextInt();
		String temp = sc.next();
		dice.setSurf(x1, x2, x3, x4, x5, x6);
		char order[] = temp.toCharArray();
		for (int i = 0; i < order.length; i++) {
			if (order[i] == 'N')
				dice.rollN();
			else if (order[i] == 'S')
				dice.rollS();
			else if (order[i] == 'E')
				dice.rollE();
			else if (order[i] == 'W')
				dice.rollW();
		}
		System.out.println(dice.getSurf1());
	}
}
