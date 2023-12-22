import java.util.*;

class Main {
	public static void main(String[] args) {
		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

		Scanner s = new Scanner(System.in);
		String c = s.next();
		int ans = 7;
		for (int i = 0; i<day.length && !(c.equals(day[i])); i++, ans--);
		System.out.println(ans);
	}
}