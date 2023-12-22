import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 0;
		switch (s){
			case "RRR":
				ans = 3;
				break;
			case "RRS":
				ans = 2;
				break;
			case "SRR":
				ans = 2;
				break;
			case "RSR":
				ans = 1;
				break;
			case "SSR":
				ans = 1;
				break;
			case "SRS":
				ans = 1;
				break;
			case "RSS":
				ans = 1;
				break;
			case "SSS":
				ans = 0;
				break;
		}
		System.out.println(ans);
	}
}