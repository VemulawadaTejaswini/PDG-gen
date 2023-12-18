import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num = br.readLine().split(" ");
		Dice dice = new Dice(1, 4, 2);

		char[] dir = br.readLine().toCharArray();
		for (char c : dir) {
			switch (c) {
			case 'N':
				dice = dice.goNorth();
				break;
			case 'E':
				dice = dice.goEast();
				break;
			case 'W':
				dice = dice.goWest();
				break;
			case 'S':
				dice = dice.goSouth();
				break;
			default:
				break;
			}
		}
		System.out.println(num[Integer.parseInt(dice.getTop()) - 1]);
	}
}

class Dice {

	int top;
	int west;
	int south;

	public Dice(int top, int west, int south) {
		this.top = top;
		this.west = west;
		this.south = south;
	}

	public Dice goNorth() {
		return new Dice(south, west, 7 - top);
	}

	public Dice goEast() {
		return new Dice(west, 7 - top, south);
	}

	public Dice goWest() {
		return new Dice(7 - west, top, south);
	}

	public Dice goSouth() {
		return new Dice(7 - south, west, top);
	}

	public String getTop() {
		return String.valueOf(top);
	}
}