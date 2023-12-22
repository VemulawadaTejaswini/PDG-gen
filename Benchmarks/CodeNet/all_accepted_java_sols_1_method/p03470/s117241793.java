import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();		// 整数列

		int num = scan.nextInt();					// 整数の個数
		for(int i = 0; i < num; i++) {
			list.add(scan.nextInt());
		}

		long count = list.stream().distinct().count();
		System.out.println(count);

		scan.close();

	}

}