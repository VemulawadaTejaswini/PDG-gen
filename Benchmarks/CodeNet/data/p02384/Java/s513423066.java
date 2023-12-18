import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			int labels[] = new int[6];
			
			for(int i = 0; i < 6; i++) {
				labels[i] = sc.nextInt();
			}
			
			int q = sc.nextInt();
			
			Dice dice = new Dice(labels);
			StringBuilder sb = new StringBuilder();
			
			int top;
			int sideS;
			for(int i = 0; i < q; i++) {
				top = sc.nextInt();
				sideS = sc.nextInt();
				
				int count = 0;
				while(dice.getSideS() != sideS) {
					if(count++ == 4) {
						dice.move("E");
					}
					dice.move("S");
				}
				while(dice.getTop() != top) {
					dice.move("E");
				}
				
				sb.append(dice.getSideE());
				sb.append("\n");
			}
			
			System.out.print(sb.toString());
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
