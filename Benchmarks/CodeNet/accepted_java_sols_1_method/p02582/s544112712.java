import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int ans = 0;
		if(s.contains("R")) {
			ans = 1;
		}
		if(s.contains("RR")) {
			ans = 2;
		}
		if(s.contains("RRR")) {
			ans = 3;
		}
		System.out.println(ans);
		sc.close();
	}
}
