import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String N = in.next();
		
		if(N.substring(N.length() - 1).equals("s")) {
			System.out.println(N + "es");
		}else {
			System.out.println(N + "s");
		}
	}
}
