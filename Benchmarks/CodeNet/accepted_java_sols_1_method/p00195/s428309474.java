import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] shop = {"A","B","C","D","E"};
		one:
		while (true) {
			int[] list = new int[5];
			int max = 0;
			for (int i = 0; i < list.length; i++) {
				String[] strings = sc.nextLine().split(" ");
				if (strings[0].equals("0") && strings[1].equals("0")) {
					break one;
				}
				int num = 0;
				num = Integer.parseInt(strings[0]) + Integer.parseInt(strings[1]);
				if (num > max) {
					max = num;
				}
				list[i] = num;
			}
			for (int i = 0; i < list.length; i++) {
				if(list[i] == max){
					System.out.println(shop[i] + " " + list[i]);
					break;
				}
			}

			
		}
	}
}