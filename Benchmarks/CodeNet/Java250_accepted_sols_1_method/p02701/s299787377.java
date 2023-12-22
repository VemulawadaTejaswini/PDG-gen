

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Set<String> fruits = new HashSet();
		for(int i = 0; i < N; i++) {
			String line = sc.next();
				fruits.add(line);
		}
		System.out.println(fruits.size());
	}

}
