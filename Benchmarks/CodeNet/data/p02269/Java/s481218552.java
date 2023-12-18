import java.util.Scanner;

public class Main {

	static int count = 0;

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();

		String[] strArray = new String[n];
		int end = 0;

		for(int i = 0; i < n; i++) {
			String order = sc.next();
			String str = sc.next();

			if(order.equals("insert")) {
				strArray[end] = str;
				end++;
			} else {
				String out = "no";

				for(int j = 0; j < end; j++) {
					if(str.equals(strArray[j])) {
						out = "yes";
						break;
					}
				}
				System.out.println(out);
			}
		}
	}

}
