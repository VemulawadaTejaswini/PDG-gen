
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
 static final List<String>  WEEK_STR   = Collections
	                                       .unmodifiableList(
	                                       Arrays.asList(
	                                         "Monday",
	                                         "Tuesday",
	                                         "Wednesday",
	                                         "Thursday",
	                                         "Friday",
	                                         "Saturday",
	                                         "Sunday"));
 static final List<Integer> MONTH_DATE = Collections
	                                       .unmodifiableList(
	                                       Arrays.asList(
	                                         31, 29, 31, 30,
	                                         31, 30, 31, 31,
	                                         30, 31, 30, 31));

 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int month = in.nextInt();
	int date = in.nextInt();
	while (month > 0) {
	 int weekDate = 2 + date;
	 for (int m = 0; m < month - 1; m++) {
		weekDate += MONTH_DATE.get(m);
	 }
	 System.out.println(WEEK_STR.get(weekDate % 7));
	 month = in.nextInt();
	 date = in.nextInt();
	}
 }
}