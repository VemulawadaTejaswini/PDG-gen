import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++) {
			String S = sc.nextLine();
			String s = S.replaceAll("Hoshino", "Hoshina");
			System.out.println(s);
		}
		sc.close();
	}
}
