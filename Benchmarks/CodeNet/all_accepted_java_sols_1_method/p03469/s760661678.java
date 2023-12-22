import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strs = str.split("/");
		System.out.println("2018/" + strs[1] + "/" + strs[2]);
	}
}