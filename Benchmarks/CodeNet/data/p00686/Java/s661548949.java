//Aizu Online Judge Volume11-1104
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int xMax = scanner.nextInt();
		int yMax = scanner.nextInt();
		
		if (xMax == 0 && yMax == 0) {return;}
		
		RobotInstance rob = new RobotInstance(xMax, yMax);
		
		while(true) {
			String s = scanner.next();
			if (s.equals("STOP")) break;
			if (s.equals("RIGHT")) {
				rob.changeDirection(true);
			}
			if (s.equals("LEFT")) {
				rob.changeDirection(false);
			}
			if (s.equals("FORWARD")) {
				int n = scanner.nextInt();
				rob.forward(n);
			}
			if (s.equals("BACKWARD")) {
				int n = scanner.nextInt();
				rob.backward(n);
			}
		}
		
		System.out.println(String.format("%1$d %2$d", rob.getX(), rob.getY()));
	}

	private static class RobotInstance {
		int xMax, yMax;
		int x, y;
		int vx, vy;
		int direction;
		
		public RobotInstance(int xMax, int yMax) {
			this.xMax = xMax;
			this.yMax = yMax;
			direction = 1;
			setVxVy();
			x = 1;
			y = 1;
		}
		
		public void forward(int n) {
			x = x + n * vx;
			y = y + n * vy;
			
			checkBorder();
		}

		public void backward(int n) {
			x = x - n * vx;
			y = y - n * vy;
			
			checkBorder();
		}
		
		public void changeDirection(boolean isRight) {
			if (isRight) {
				direction += 1;
			} else {
				direction -= 1;
			}
			
			if (direction == 0) {direction = 4;}
			if (direction == 5) {direction = 1;}
			
			setVxVy();
		}
		
		private void checkBorder() {
			if (x < 1) {x = 1;}
			if (x > xMax) {x = xMax;}
			if (y < 1) {y = 1;}
			if (y > yMax) {y = yMax;}
		}
		
		private void setVxVy() {
			if (direction == 1) {
				vx = 0; vy = 1;
			}
			if (direction == 2) {
				vx = 1; vy = 0;
			}
			if (direction == 3) {
				vx = 0; vy = -1;
			}
			if (direction == 4) {
				vx = -1; vy = 0;
			}
		}
		
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
	}
}