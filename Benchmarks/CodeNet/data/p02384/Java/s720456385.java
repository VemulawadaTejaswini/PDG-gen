import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] num = br.readLine().split(" ");
		Dice dice = new Dice(1, 4, 2);
		Dice temp;

		int N = Integer.parseInt(br.readLine());

		Loop:for(int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");

			temp = dice.goNorth();
			if((temp.getTop()).equals(str[0]) && (temp.getSouth()).equals(str[1])) {
				System.out.println(num[Integer.parseInt(temp.getEast()) - 1]);
				dice = temp;
				continue Loop;
			}

			temp = dice.goEast();
			if((temp.getTop()).equals(str[0]) && (temp.getSouth()).equals(str[1])) {
				System.out.println(num[Integer.parseInt(temp.getEast()) - 1]);
				dice = temp;
				continue Loop;
			}

			temp = dice.goWest();
			if((temp.getTop()).equals(str[0]) && (temp.getSouth()).equals(str[1])) {
				System.out.println(num[Integer.parseInt(temp.getEast()) - 1]);
				dice = temp;
				continue Loop;
			}

			temp = dice.goSouth();
			if((temp.getTop()).equals(str[0]) && (temp.getSouth()).equals(str[1])) {
				System.out.println(num[Integer.parseInt(temp.getEast()) - 1]);
				dice = temp;
				continue Loop;
			}
		}
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

	public String getEast() {
		return String.valueOf(7 - west);
	}

	public String getSouth() {
		return String.valueOf(south);
	}
}