import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++){
			String str = sc.nextLine();

			String[] strs = str.split(" ");

				for (int j = 0; j < strs.length; j++) {
					String sp = (j < strs.length - 1)? " ": "\n";

						if (strs[j].equals("Hoshino")) {
							strs[j] = "Hoshina";
						}
					System.out.print(strs[j] + sp);
				}
		}
	sc.close();

	}

}
