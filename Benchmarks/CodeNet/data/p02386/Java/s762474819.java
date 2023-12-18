import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			List<Dice> allDice = new ArrayList<>();
			
			for(int i = 0; i < n; i++) {
				int[] labels = new int[6];
				for(int j = 0; j < 6; j++) {
					labels[j] =  sc.nextInt();
				}
				allDice.add(new Dice(labels));
			}
			
			
			Dice dice1;
			Dice dice2;
			for(int i = 0; i < n - 1; i++) {
				dice1 = allDice.get(i);
				
				for(int j = i + 1; j < n; j++) {
					dice2 = allDice.get(j);
					if(dice1.isSame(dice2)) {
						System.out.println("No");
						return;
					}
				}
			}
			
			System.out.println("Yes");
		}
	}
}

class Dice {
	
	private int position[];
	
	Dice(int labels[]){
		this.position = labels;
	}
	
	void move(String order) {
		if(order.equals("N")) {
			position = new int[]{position[1], position[5], position[2], position[3], position[0], position[4]};
			return;
		}
		if(order.equals("E")) {
			position = new int[]{position[3], position[1], position[0], position[5], position[4], position[2]};
			return;
		}
		if(order.equals("S")) {
			position = new int[]{position[4], position[0], position[2], position[3], position[5], position[1]};
			return;
		}
		if(order.equals("W")) {
			position = new int[]{position[2], position[1], position[5], position[0], position[4], position[3]};
			return;
		}
	}
	
	boolean isSame(Dice dice) {
		int countS = 0;
		while(this.getSideS() != dice.getSideS()) {
			if(countS == 8) {
				return false;
			}
			if(countS++ == 4) {
				dice.move("E");
			}
			dice.move("S");
		}
		
		int countE = 0;
		while(this.getTop() != dice.getTop()) {
			if(countE++ >= 4) {
				return false;
			}
			dice.move("E");
		}
		
		if(this.getSideE() != dice.getSideE()) {
			return false;
		}
		if(this.getSideW() != dice.getSideW()) {
			return false;
		}
		if(this.getSideN() != dice.getSideN()) {
			return false;
		}
		if(this.getBottom() != dice.getBottom()) {
			return false;
		}
		
		return true;
	}
	
	int getTop() {
		return position[0];
	}
	int getSideS() {
		return position[1];
	}
	int getSideE() {
		return position[2];
	}
	int getSideW() {
		return position[3];
	}
	int getSideN() {
		return position[4];
	}
	int getBottom() {
		return position[5];
	}
}
