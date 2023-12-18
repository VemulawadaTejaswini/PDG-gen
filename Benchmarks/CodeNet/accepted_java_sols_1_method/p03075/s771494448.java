

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		for (int i = 0; i < 5; i++) {
			array[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		
		
		
		if (array[4] - array[0] > k) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}

	}

}
