import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			String x = sc.nextLine();
			int y = 0;
			if (x.equals("0") == true) {
				break;
			}
			for (int i = 0; i < x.length(); i++) {
				y += x.charAt(i) - '0';
			}
			System.out.println(y);
		}
		sc.close();
	}

}
