import java.util.Scanner;

public class Main {

	static class Dice {
		private int[] label;
		
		public Dice(int[] num) {
			label = num;
		}
		
		public void roll(char op) {
			int tmp;
			
			switch (op) {
				case 'E':
					tmp = label[0];
					label[0] = label[3];
					label[3] = label[5];
					label[5] = label[2];
					label[2] = tmp;
					break;
				case 'N':
					tmp = label[0];
					label[0] = label[1];
					label[1] = label[5];
					label[5] = label[4];
					label[4] = tmp;
					break;
				case 'S':
					tmp = label[0];
					label[0] = label[4];
					label[5] = label[5];
					label[5] = label[1];
					label[1] = tmp;
					break;
				case 'W':
					tmp = label[0];
					label[0] = label[2];
					label[2] = label[5];
					label[5] = label[3];
					label[3] = tmp;
					break;
			}
		}
		
		public int getAboveNum() {
			return label[0];
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[6];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}

		Dice dice = new Dice(nums);
		String op = scan.next();
		
		for (int i = 0; i < op.length(); i++) {
			dice.roll(op.charAt(i));
		}

		System.out.println(dice.getAboveNum());
		scan.close();
	}

}