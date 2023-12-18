import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Dice dice = new Dice();
		dice.inputOrder();
		int[] array = dice.roll();
		System.out.println(array[1]);
	}
}
	

class Dice {
	int[] num = new int[6 + 1];
	String order;
	Dice() {
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i < 7; i++) {
			this.num[i] = scan.nextInt();
		}
	}

	public void inputOrder() {
		Scanner scan = new Scanner(System.in);
		this.order = scan.next();
	}
	
	public int[] getNum() {
		return this.num;
	}
	
	public int getNumber(int i) {
		return this.num[i];
	}
	
	// ??????????????¢??????????????????
	public int[] roll() {
		int now_1 = 1;	int now_2 = 2;	int now_3 = 3;	int tmp;
		int[] array = getNum();
		String str = this.order;
		char[] check = {'N', 'E', 'S', 'W'};
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < check.length; j++) {
				if (str.charAt(i) == check[j]) {
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
}