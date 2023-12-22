import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt() + sc.nextInt();
		if(ans > 9) System.out.println("error");
		else System.out.println(ans);
	}
}
