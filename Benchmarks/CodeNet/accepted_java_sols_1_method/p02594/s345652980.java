import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int input = Integer.parseInt(sc.nextLine());
		String result = input >= 30 ? "Yes" : "No";
	    System.out.println(result);
	}
}
