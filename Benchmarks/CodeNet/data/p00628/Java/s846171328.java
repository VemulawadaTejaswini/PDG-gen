import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			while (sc.hasNext()){
				String str = sc.nextLine();
					if (str.equals("END OF INPUT")) {
						break;
					}
				String[] strs = str.split(" ");

					for (int i = 0; i < strs.length; i++) {
						System.out.print(strs[i].length());
					}
				System.out.println();
			}
		sc.close();

	}
}
