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

class Dice {
	private int surf1;
	private int surf2;
	private int surf3;
	private int surf4;
	private int surf5;
	private int surf6;
	private int upper;

	public int getSurf1() {
		return surf1;
	}

	public int getSurf2() {
		return surf2;
	}

	public int getSurf3() {
		return surf3;
	}

	public int getSurf4() {
		return surf4;
	}

	public int getSurf5() {
		return surf5;
	}

	public int getSurf6() {
		return surf6;
	}

	public void setSurf(int surf1, int surf2, int surf3, int surf4, int surf5, int surf6) {
		this.surf1 = surf1;
		this.surf2 = surf2;
		this.surf3 = surf3;
		this.surf4 = surf4;
		this.surf5 = surf5;
		this.surf6 = surf6;
	}

	public void rollN() {
		this.upper = this.surf2;
		this.surf2 = this.surf6;
		this.surf6 = this.surf5;
		this.surf5 = this.surf1;
		this.surf1 = this.upper;
	}

	public void rollS() {
		this.upper = this.surf5;
		this.surf5 = this.surf6;
		this.surf6 = this.surf2;
		this.surf2 = this.surf1;
		this.surf1 = this.upper;
	}

	public void rollE() {
		this.upper = this.surf4;
		this.surf4 = this.surf6;
		this.surf6 = this.surf3;
		this.surf3 = this.surf1;
		this.surf1 = this.upper;
	}

	public void rollW() {
		this.upper = this.surf3;
		this.surf3 = this.surf6;
		this.surf6 = this.surf4;
		this.surf4 = this.surf1;
		this.surf1 = this.upper;
	}
}
