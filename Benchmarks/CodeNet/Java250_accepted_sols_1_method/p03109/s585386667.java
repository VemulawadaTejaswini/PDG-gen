import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("/");
		if(Integer.parseInt(s[1]) > 4) {
			System.out.println("TBD");
		}else {
			System.out.println("Heisei");
		}

		sc.close();
	}
}