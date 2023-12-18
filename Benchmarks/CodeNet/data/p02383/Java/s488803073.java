import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	static class Dice {
		
		private int[] sides;
		private int top;
		private int north;
		private int east;
		private int south;
		private int west;
		private int bottom;
		
		private static Dice getDice(String line) {
			Dice dice = new Dice();
			dice.top = 0;
			dice.north = 4;
			dice.east = 2;
			dice.south = 1;
			dice.west = 3;
			dice.bottom = 5;
			String[] sides = line.split(" ");
			dice.sides = new int[sides.length];
			for (int i = 0; i < sides.length; i++) {
				dice.sides[i] = Integer.parseInt(sides[i]);
			}
			return dice;
		}
		
		private static int roll(Dice dice, String line) {
			int top = dice.top;
			int north = dice.north;
			int east = dice.east;
			int south = dice.south;
			int west = dice.west;
			int bottom = dice.bottom;
			int tmp;
			
			char[] operations = line.toCharArray();
			for (char operation : operations) {
				switch (operation) {
				case 'N':
					tmp = south;
					south = bottom;
					bottom = north;
					north = top;
					top = tmp;
					break;
				case 'E':
					tmp = west;
					west = bottom;
					bottom = east;
					east = top;
					top = tmp;
					break;
				case 'S':
					tmp = north;
					north = bottom;
					bottom = south;
					south = top;
					top = tmp;
					break;
				case 'W':
					tmp = east;
					east = bottom;
					bottom = west;
					west = top;
					top = tmp;
					break;
				}
			}
			dice.top = top;
			dice.north = north;
			dice.east = east;
			dice.south = south;
			dice.west = west;
			dice.bottom = bottom;
			return dice.sides[top];
		}
	}

	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String line = input.readLine();
			String roll = input.readLine();
			
			Dice dice = Dice.getDice(line);
			System.out.println(dice.roll(dice, roll));
			
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}