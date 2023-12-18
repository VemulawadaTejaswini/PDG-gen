import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int[] sides = new int[6];
		for (int i = 0; i < 6; i++) {
			sides[i] = Integer.parseInt(input[i]);
		}
		Dice dice = new Dice(sides);

		char[] ca = br.readLine().toCharArray();
		for (char c : ca) {
			switch (c) {
				case 'N':
					dice.N();
					break;
				case 'E':
					dice.E();
					break;
				case 'S':
					dice.S();
					break;
				case 'W':
					dice.W();
					break;
				default:
				break;
			}
		}
		System.out.println(dice.getSide(0));
	}
	
}
class Dice {
	private int[] sides = new int[6];
	Dice(int[] sides) {
		this.sides = sides;
	}

	public void N() {
		int tmp = sides[0];
		sides[0] = sides[1];
		sides[1] = sides[5];
		sides[5] = sides[4];
		sides[4] = tmp;
	}

	public void E() {
		int tmp = sides[0];
		sides[0] = sides[3];
		sides[3] = sides[5];
		sides[5] = sides[2];
		sides[2] = tmp;
	}

	public void S() {
		int tmp = sides[0];
		sides[0] = sides[4];
		sides[4] = sides[5];
		sides[5] = sides[1];
		sides[1] = tmp;
	}

	public void W() {
		int tmp = sides[0];
		sides[0] = sides[2];
		sides[2] = sides[5];
		sides[5] = sides[3];
		sides[3] = tmp;
	}

	public int getSide(int i) {
		return sides[i];
	}
}