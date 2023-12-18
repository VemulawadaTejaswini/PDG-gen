import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] sort = new String[n];
		for(int i = 0 ; i < n ; i++) {
			String name = sc.next();
			int point = sc.nextInt();
			point = 100 - point;
			String pointStr = String.format("%03d", point);
			int num = i + 1;
			// ソート用の文字列として上記をつなげる
			String forSort = name + pointStr + "/" + num;
			sort[i] = forSort;
		}

		Arrays.sort(sort);
		for(int i = 0 ; i < n ; i++) {
			String[] splited = sort[i].split("/");
			System.out.println(splited[splited.length - 1]);
		}

		sc.close();

	}

}
