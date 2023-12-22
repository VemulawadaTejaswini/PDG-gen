import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] sl = s.split("");
		sl[3] = "8";
		System.out.println(String.join("", sl));
		}
	}