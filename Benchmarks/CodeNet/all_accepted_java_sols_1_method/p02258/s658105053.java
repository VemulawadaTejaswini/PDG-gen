import java.util.ArrayList;
import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;
		int temp;
		int num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			list.add(scan.nextInt());
		}

		for(int i = 0; i < num - 1; i++) {
			temp = list.get(i);
			if(i == 0) {
				minNum = temp;
			} else if (temp > minNum) {
				continue;
			} else {
				minNum = temp;
			}
			for(int j = i + 1; j < num; j++) {
				if(list.get(j) - temp > max) {
					max = list.get(j) - temp;
				}
			}
		}

		System.out.println(max);
	}
}
