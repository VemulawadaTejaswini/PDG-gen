import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ans = null;
		if(s.charAt(s.length() - 1) == 's') {
			ans = s + "es";
		}else {
			ans = s + "s";
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
