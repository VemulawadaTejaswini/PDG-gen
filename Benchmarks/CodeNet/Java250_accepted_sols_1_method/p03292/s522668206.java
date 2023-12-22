import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a[] = new int[3];
		for(int i = 0; i < 3 ; i++) {
			list.add(scanner.nextInt());
		}

		Collections.sort(list, Collections.reverseOrder());

		int sum = 0;
		int buf = 0;
		int count = 0;
		for(int i : list) {
			if(count != 0) {
				sum += (buf - i);
			}
			count++;
			buf = i;
		}
		System.out.println(sum);
	}

}