import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sk = sc.nextLine();
		String s = sc.nextLine();
		int k = Integer.parseInt(sk);
		if(s.length()<=k) {
			System.out.println(s);
		}else {
			System.out.println(s.substring(0,k) + "...");
		}
		sc.close();
	}
}