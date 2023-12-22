import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();		// 整数列
		int count = 0;								// 操作回数用

		int num = scan.nextInt();					// 整数の個数
		for(int i = 0; i < num; i++) {
			list.add(scan.nextInt());
		}

		out:
		while(true) {
			for(int i = 0; i < num; i++) {
				int tmp = list.get(i);

				if(tmp % 2 == 0)
					list.set(i, tmp / 2);
				else
					break out;
			}
			count++;
		}

		System.out.println(count);
		scan.close();
	}
}
