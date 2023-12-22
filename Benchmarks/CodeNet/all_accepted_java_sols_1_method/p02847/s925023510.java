import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力値
		String t = sc.next();
		sc.close();
		// 曜日
		List<String> holiday = new LinkedList<>();
		Collections.addAll(holiday, "SUN","MON","TUE","WED","THU","FRI","SAT");
		int todayIndex = holiday.indexOf(t);
		int sunIndex = holiday.indexOf("SUN");
//		System.out.println(todayIndex+":"+sunIndex);
		// 日曜日が何日後か判定する
		System.out.println(holiday.size()-todayIndex);
	}
}
