import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean[] cups = {true, false, false};
		while(sc.hasNext()) {
			char[] chars = sc.next().toCharArray();
			cups = change(chars[0], chars[2], cups);
		}
		String str = null;
		for(int $ = 0; $ < 3; $++) {
			if(cups[$]) {
				if($ == 0) {
					str = "A";
				} else if($ == 1) {
					str = "B";
				} else {
					str = "C";
				}
				System.out.println(str);
				break;
			}
		}
	}

	public static boolean[] change(char cup1, char cup2, boolean[] array) {
		char[] cups = {cup1, cup2};
		int[] num = new int[2];
		for(int $ = 0; $ < 2; $++) {
			if(cups[$] == 'A') {
				num[$] = 0;
			} else if(cups[$] == 'B') {
				num[$] = 1;
			} else {
				num[$] = 2;
			}
		}

		boolean box = array[num[0]];
		array[num[0]] = array[num[1]];
		array[num[1]] = box;

		return array;
	}

}