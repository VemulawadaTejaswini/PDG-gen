import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			while(sc.hasNext()) {
				String str = sc.nextLine();
					if (str.equals("EOF")) {
						break;
					}
				String[] s = str.split(" ");

				System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
			}
		sc.close();

	}

}
