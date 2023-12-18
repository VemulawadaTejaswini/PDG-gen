import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static class Dice {
		private int[] label;
		
		public static int ABOVE_INDEX = 0;
		public static int FRONT_INDEX = 1;
		public static int RIGHT_INDEX = 2;
		public static int LEFT_INDEX = 3;
		public static int BACK_INDEX = 4;
		public static int BELOW_INDEX = 5;
		
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
					label[4] = label[5];
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
		
		public void horizontalRotation() {
			int tmp = label[1];
			label[1] = label[3];
			label[3] = label[4];
			label[4] = label[2];
			label[2] = tmp;
		}

		public void putDown(int aboveNum, int frontNum) {
			int i;
			for (i = 0; i < 4; i++) {
				roll('N');
				if (getAboveNum() == aboveNum) {
					break;
				}
			}
			
			if (i == 4) {
				for (i = 0; i < 4; i++) {
					roll('E');
					if (getAboveNum() == aboveNum) {
						break;
					}
				}
			}
			
			for (i = 0; i < 4; i++) {
				horizontalRotation();
				if (getNum(FRONT_INDEX) == frontNum) {
					break;
				}
			}
		}
		
		public int getAboveNum() {
			return label[0];
		}

		public int getNum(int index) {
			if (index >= label.length) {
				throw new IllegalArgumentException();
			}
			
			return label[index];
		}
		
		@Override
		public boolean equals(Object obj) {
			Dice arg = (Dice) obj; 
			for (int i = 0; i < label.length; i++) {
				boolean isExist = false;
				for (int j = 0; j < arg.label.length; j++) {
					if (label[i] == arg.label[j]) {
						isExist = true;
						break;
					}
				}
				if (!isExist) {
					return false;
				}
			}
			
			arg.putDown(label[ABOVE_INDEX], label[FRONT_INDEX]);
			
			for (int i = 0; i < label.length; i++) {
				if (label[i] != arg.label[i]) {
					return false;
				}
			}
			return true;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums1 = new int[6];
		
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = scan.nextInt();
		}

		Dice d1 = new Dice(nums1);

		int[] nums2 = new int[6];

		for (int i = 0; i < nums2.length; i++) {
			nums2[i] = scan.nextInt();
		}
		
		Dice d2 = new Dice(nums2);

		if (d1.equals(d2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		scan.close();
	}

}