import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String ans = "";
		if (n.equals("Sunny")) {
			ans = "Cloudy";
		} else if (n.equals("Cloudy")) {
			ans = "Rainy";
		} else {
			ans = "Sunny";
		}
		System.out.println(ans);
	}
}