import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = "IMPOSSIBLE";
		if((b - a) % 2 == 0){
			s = String.valueOf(((b - a) / 2) + a);
		}
		System.out.println(s);
	}
}
