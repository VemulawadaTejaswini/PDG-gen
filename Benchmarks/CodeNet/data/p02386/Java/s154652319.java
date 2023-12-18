import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		Dice[] d = new Dice[n];
		for (int i = 0; i < n; i++)
			d[i] = new Dice(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(),
					scan.nextInt());
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				if (d[i].checkEqual(d[j])) {
					System.out.println("No");
					System.exit(0);
				}

		System.out.println("Yes");

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

	public boolean checkEqual(Dice d) {
		String pattern = "WWWSWWWSWWWSSWWWSSSWWWWWSWWW ";
		for (int i = 0; i < pattern.length(); i++) {
			if (equal(d))
				return true;
			operate(pattern.charAt(i));
		}
		return false;
	}

	public boolean equal(Dice d) {
		if (Upp == d.getUpp() && Sou == d.getSou() && Est == d.getEst() && Wst == d.getWst() && Nor == d.getNor()
				&& Bot == d.getBot())
			return true;
		else
			return false;
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

	public int getWst() {
		return Wst;
	}

	public int getNor() {
		return Nor;
	}

	public int getBot() {
		return Bot;
	}

	public int getSou() {
		return Sou;
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