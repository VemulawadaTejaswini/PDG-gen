import java.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		List day = Arrays.asList("","SAT","FRI","THU","WED","TUE","MON","SUN");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(day.indexOf(str));
	}
}
