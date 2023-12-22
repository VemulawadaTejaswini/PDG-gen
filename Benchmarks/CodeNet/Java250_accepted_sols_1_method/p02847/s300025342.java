import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();
		String sun = "SUN";
		String mon = "MON";
		String tue = "TUE";
		String wed = "WED";
		String thu = "THU";
		String fri = "FRI";
		String sat = "SAT";
		// 出力
		if( s.equals(sat)) {
			System.out.println("1");
		} else if( s.equals(fri) ) {
			System.out.println("2");
		} else if( s.equals(thu) ) {
			System.out.println("3");
		} else if( s.equals(wed) ) {
			System.out.println("4");
		} else if( s.equals(tue) ) {
			System.out.println("5");
		} else if( s.equals(mon) ) {
			System.out.println("6");
		} else {
			System.out.println("7");
		}
	}
}
