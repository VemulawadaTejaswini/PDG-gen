import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[6 + 1];
		array[0] = 0;
		for (int i = 1; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		String order = scan.next();
		scan.close();
		Dice dice = new Dice(array);
		array = dice.roll(order);
		System.out.println(array[0]);
	}
}
	

class Dice {
	int[] num = new int[6 + 1];
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
	public int[] roll(String order) {
		int now_1 = 1;	int now_2 = 2;	int now_3 = 3;	int tmp;
		int[] array = getNum();
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
		cp_array[0] = array[now_1]; cp_array[1] = array[now_2];
		cp_array[2] = array[now_3]; cp_array[3] = array[7 - now_3];
		cp_array[4] = array[7 - now_1]; cp_array[5] = array[7 -now_2];
		return cp_array;
	}
}