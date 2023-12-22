import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// https://atcoder.jp/contests/abc146/tasks/abc146_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();


		String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

		List<String> list = Arrays.asList(day);
		System.out.println(day.length-list.indexOf(S));

	}

}
