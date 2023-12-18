import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String x =sc.next();
	String ans ="NO";

	if(x.matches("[357]")) {
		ans="YES";
	}
	System.out.println(ans);

	}
}