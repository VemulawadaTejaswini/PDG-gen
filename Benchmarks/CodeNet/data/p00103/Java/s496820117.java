import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			Ground ground = new Ground();
			int out = 0;
			String s;
			
			while(out < 3) {
				s = scanner.nextLine();
				if (s.equals("OUT")) {
					out++;
				} else if (s.equals("HIT")) {
					ground.hit();
				} else if (s.equals("HOMERUN")) {
					ground.homerun();
				}
			}
			System.out.println(ground.getScore());
		}
	}

	private static class Ground {
		boolean isFirst;
		boolean isSecond;
		boolean isThird;
		int score;
		int runners;
		
		private void countRunners() {
			runners = 0;
			if (isFirst) {runners++;}
			if (isSecond) {runners++;}
			if (isThird) {runners++;}
		}

		public void clearRunners() {
			isFirst = false;
			isSecond = false;
			isThird = false;
			runners = 0;
		}

		public int getScore() {
			return score;
		}
		public void hit() {
			if (!isFirst) {
				isFirst = true;
			} else {
				if (!isSecond) {
					isSecond = true;
				} else {
					if (!isThird) {
						isThird = true;
					} else {
						score++;
					}
				}
			}
			countRunners();
		}
		
		public void homerun() {
			score += runners + 1;
			clearRunners();
		}
	}
}