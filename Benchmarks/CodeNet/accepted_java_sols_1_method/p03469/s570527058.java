import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.next();

		System.out.println(date.replaceFirst("2017/01", "2018/01"));
	}
}


