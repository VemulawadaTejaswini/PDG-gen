import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String ans = n.contains("7") ? "Yes" : "No";
		System.out.println(ans);
	}
}
