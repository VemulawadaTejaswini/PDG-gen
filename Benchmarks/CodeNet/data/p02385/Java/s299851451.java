import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			int labels1[] = new int[6];
			int labels2[] = new int[6];
			
			for(int i = 0; i < 6; i++) {
				labels1[i] = sc.nextInt();
			}
			for(int i = 0; i < 6; i++) {
				labels2[i] = sc.nextInt();
			}
			
			Dice dice1 = new Dice(labels1);
			Dice dice2 = new Dice(labels2);
			
			int count1 = 0;
			while(dice1.getSideS() != dice2.getSideS()) {
				if(count1++ == 4) {
					dice2.move("E");
				}
				dice2.move("S");
			}
			
			int count2 = 0;
			while(dice1.getTop() != dice2.getTop()) {
				if(count2++ >= 4) {
					System.out.println("No");
					return;
				}
				dice2.move("E");
			}
			
			if(dice1.getSideE() != dice2.getSideE()) {
				System.out.println("No");
				return;
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
	
	int getTop() {
		return position[0];
	}
	
	int getSideS() {
		return position[1];
	}
	
	int getSideE() {
		return position[2];
	}
}
