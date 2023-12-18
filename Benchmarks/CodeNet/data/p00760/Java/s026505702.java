import java.util.Scanner;

//https://onlinejudge.u-aizu.ac.jp/problems/1147
public class Main {

  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	final int DAY_OF_MILLENNIUM = 196470;
	final int DAY_OF_SPECIAL_YEAR = 200;
	final int DAY_OF_NORMAL_YEAR = 195;
	final int DAY_OF_SMALL_DAY = 19;
	final int DAY_OF_BIG_MONTH = 20;

	int n = sc.nextInt();
	for (int i = 0; i < n; i++) {
	  int year = sc.nextInt();
	  int month = sc.nextInt();
	  int date = sc.nextInt();

	  int specialYear = (year - 1) / 3;
	  int normalYear = year - 1 - specialYear;
	  int result = specialYear * DAY_OF_SPECIAL_YEAR;
	  result += normalYear * DAY_OF_NORMAL_YEAR;

	  if (year % 3 == 0) {
		result += (month - 1) * DAY_OF_BIG_MONTH;
	  } else {
		int monthOfResult = (month - 1) / 2;
		int dayOfResult = month - 1 - monthOfResult;
		result += monthOfResult * DAY_OF_SMALL_DAY;
		result += dayOfResult * DAY_OF_BIG_MONTH;
	  }
	  result += date - 1;
	  result = DAY_OF_MILLENNIUM - result;
	  System.out.println(result);
	}
  }
}
