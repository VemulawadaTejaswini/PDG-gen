
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = "", ans = "";
		
		s = sc.nextLine();
		sc.close();
		
		ans = s.replace(",", " ");
		System.out.println(ans);
	}

}
