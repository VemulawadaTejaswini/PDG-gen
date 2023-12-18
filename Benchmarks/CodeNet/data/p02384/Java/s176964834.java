import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Dice d = new Dice(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(),
				scan.nextInt());

		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int upp = scan.nextInt();
			int sou = scan.nextInt();
			d.rotate(upp, sou);
			System.out.println(d.getEst());
		}

		scan.close();
		System.exit(0);
	}

}

class Dice {
	int Upp, Sou, Est, Wst, Nor, Bot;

	public Dice(int upp, int sou, int est, int wst, int nor, int bot) {
		Upp = upp;
		Sou = sou;
		Est = est;
		Wst = wst;
		Nor = nor;
		Bot = bot;
	}

	public void rotate(int upp, int sou) {
		if (sou == Wst || sou == Est)
			operate('E');
		for (int i = 0; i < 4; i++) {
			if (sou == Sou)
				break;
			operate('N');
		}
		for (int i = 0; i < 4; i++) {
			if (upp == Upp)
				break;
			operate('E');
		}
	}

	public int getEst() {
		return Est;
	}

	public void operate(char op) {
		int tmp;
		switch (op) {
		case 'S':
			tmp = Upp;
			Upp = Nor;
			Nor = Bot;
			Bot = Sou;
			Sou = tmp;
			break;
		case 'E':
			tmp = Upp;
			Upp = Wst;
			Wst = Bot;
			Bot = Est;
			Est = tmp;
			break;
		case 'W':
			tmp = Upp;
			Upp = Est;
			Est = Bot;
			Bot = Wst;
			Wst = tmp;
			break;
		case 'N':
			tmp = Upp;
			Upp = Sou;
			Sou = Bot;
			Bot = Nor;
			Nor = tmp;
			break;
		}
	}

	public int getUpp() {
		return Upp;
	}

}