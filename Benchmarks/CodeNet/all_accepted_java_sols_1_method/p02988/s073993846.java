

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];

		for(int i = 0; i < num.length; i++) {
			String line = sc.next();
			num[i] = Integer.parseInt(line);
		}

		int count = 0;
		for(int i = 1; i < num.length - 1 ; i++) {
			if(num[i-1] < num[i] && num[i] < num[i+1]) {
				count++;
			}else if(num[i-1] > num[i] && num[i] > num[i+1]) {
				count++;
			}
		}

		System.out.println(count);
	}

}
