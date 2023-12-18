import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			Dice d = new Dice();
			int sum = 1;
			for(int i=0;i<n;i++) {
				String cmd = sc.next();
				if (cmd.equals("North")) {
					d.rollBack();
				}else if(cmd.equals("East")) {
					d.rollRight();
				}else if(cmd.equals("West")) {
					d.rollLeft();
				}else if(cmd.equals("South")) {
					d.rollFront();
				}else if(cmd.equals("Right")) {
					d.turnClockwise();
				}else if(cmd.equals("Left")) {
					d.turnCounterClockwise();
				}
				sum += d.top;
			}
			System.out.println(sum);
		}
	}

}

class Dice {
	int top,bottom,front,back,left,right;
	public Dice() {
		top = 1;
		front = 2;
		right = 3;
		bottom = 6;
		back = 5;
		left = 4;
	}
	public void rollFront() {
		front = top;
		top = back;
		back = 7 - front;
		bottom = 7 - top;
	}
	public void rollBack() {
//		back = top;
//		top = front;
//		front = 7 - back;
//		bottom = 7 - top;
		rollFront();
		rollFront();
		rollFront();
	}
	public void rollRight() {
		right = top;
		top = left;
		left = 7 - right;
		bottom = 7 - top;
	}
	public void rollLeft() {
//		left = top;
//		top = right;
//		right = 7 - left;
//		bottom = 7 - right;
		rollRight();
		rollRight();
		rollRight();
	}
	public void turnClockwise() {
		front = right;
		right = back;
		back = 7 - front;
		left = 7 - right;
	}
	public void turnCounterClockwise() {
//		front = left;
//		left = back;
//		back = 7 - front;
//		right = 7 - left;
		turnClockwise();
		turnClockwise();
		turnClockwise();
	}
}