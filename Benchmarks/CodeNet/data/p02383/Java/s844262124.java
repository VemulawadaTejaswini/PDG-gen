import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		Dice dice = new Dice(a,b,c,d,e,f);
		
		String line = sc.next();
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 'E') dice.moveE();
			if (line.charAt(i) == 'N') dice.moveN();
			if (line.charAt(i) == 'S') dice.moveS();
			if (line.charAt(i) == 'W') dice.moveW();
		}
		System.out.println(dice.getTop());
	}
}

class Dice {
	private int[] dice;
	
	Dice(int a, int b, int c, int d, int e, int f) {
		dice = new int[6];
		dice[0] = a;
		dice[1] = b;
		dice[2] = c;
		dice[3] = d;
		dice[4] = e;
		dice[5] = f;
	}
	void moveW() {
		int tmp = dice[3];
		dice[3] = dice[1];
		dice[1] = dice[2];
		dice[2] = dice[4];
		dice[4] = tmp;
	}
	void moveS() {
		int tmp = dice[5];
		dice[5] = dice[1];
		dice[1] = dice[0];
		dice[0] = dice[4];
		dice[4] = tmp;
	}
	void moveN() {
		int tmp = dice[0];
		dice[0] = dice[1];
		dice[1] = dice[5];
		dice[5] = dice[4];
		dice[4] = tmp;
	}
	void moveE() {
		int tmp = dice[1];
		dice[1] = dice[3];
		dice[3] = dice[4];
		dice[4] = dice[2];
		dice[2] = tmp;
	}
	int getTop() {
		return dice[1];
	}
}

