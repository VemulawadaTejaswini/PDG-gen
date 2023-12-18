import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine().toLowerCase();
		int count = 0;

		while (scanner.hasNext()) {
			String str = scanner.nextLine().toLowerCase();
			String[] strs = str.split(" ");
			end:
			for (int i = 0; i < strs.length; i++) {
				if(strs[i].equals("end_of_text")){
					break end;
				}
				if (strs[i].contains(ans)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}