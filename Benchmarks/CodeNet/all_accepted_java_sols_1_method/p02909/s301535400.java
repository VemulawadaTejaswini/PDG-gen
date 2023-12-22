import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] tenki = {"Sunny", "Cloudy", "Rainy"};
		int count = 0;
		for (int i = 0; i < 3; i++) {
			count++;
			if (count >= 3) {
				count = 0;
			}
			if (s.equals(tenki[i])) {
				System.out.println(tenki[count]);
			}
		}
	}
}