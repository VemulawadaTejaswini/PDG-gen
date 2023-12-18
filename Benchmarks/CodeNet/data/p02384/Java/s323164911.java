import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[6 + 1];
		array[0] = 0;
		for (int i = 1; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		int q = scan.nextInt();
		Dice dice = new Dice(array);
		int part1; int part2;
		for (int i = 0; i < q; i++) {
			part1 = scan.nextInt();
			part2 = scan.nextInt();
			System.out.println(dice.check(part1, part2));
		}
		scan.close();
	}
}
	

class Dice {
	private int[] num = new int[6 + 1];
	Dice() {
	}

	Dice(int[] array) {
		for (int i = 0; i < array.length; i++) {
			this.num[i] = array[i];
		}
	}
	
	public int[] getNum() {
		return this.num;
	}
	
	public int getNumber(int i) {
		return this.num[i];
	}
	
	// ??????????????¢??????????????????
	public int[] roll(int[]ary, String order) {
		int now_1 = 1;	int now_2 = 2;	int now_3 = 3;	int tmp;
		int[] array = ary;
		char[] check = {'N', 'E', 'S', 'W'};
		for (int i = 0; i < order.length(); i++) {
			for (int j = 0; j < check.length; j++) {
				if (order.charAt(i) == check[j]) {
					switch (j + 1) {
						case 1:
							tmp = now_1;
							now_1 = now_2;
							now_2 = 7 - tmp;
							break;
						case 2:
							tmp = now_1;
							now_1 = 7 - now_3;
							now_3 = tmp;
							break;
						case 3:
							tmp = now_1;
							now_1 = 7 - now_2;
							now_2 = tmp;
							break;
						case 4:
							tmp = now_1;
							now_1 = now_3;
							now_3 = 7 - tmp;
							break;
					}
				}
			}
		}
		int[] cp_array = new int[array.length];
		cp_array[1] = array[now_1]; cp_array[2] = array[now_2];
		cp_array[3] = array[now_3]; cp_array[4] = array[7 - now_3];
		cp_array[5] = array[7 - now_2]; cp_array[6] = array[7 -now_1];
		return cp_array;
	}
	
	// 3?????¨?????????????????????
	public int check(int part1, int part2) {
		String[] str = {"null", "N", "NN", "S", "W", "E"};
		int sum = 0;
		int[] array = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			array[i] = num[i];
		}
		boolean decision = false;
		for (int i = 0; i < str.length; i++) {
			array = this.roll(array, str[i]);
			for (int j = 0; j < 4; j++) {
				if (array[1] == part1) {
					if (array[2] == part2) {
						sum = array[3];
						decision = true;
						break;
					} else {
						array = this.roll(array, "NWS");
					}
				} else {
				}
			}
			if (decision) break;
		}
		

		return sum;
	}
}