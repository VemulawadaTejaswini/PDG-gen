import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		switch (s) {
		case "Sunny":
			sb.append("Cloudy");
			break;
		case "Cloudy":
			sb.append("Rainy");
			break;
		case "Rainy":
			sb.append("Sunny");
		}
		System.out.println(sb);
	}
}