import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] strs = sc.nextLine().split(" ");
		String answer = "A"+strs[1].charAt(0)+"C";
		System.out.println(answer);
	}
}