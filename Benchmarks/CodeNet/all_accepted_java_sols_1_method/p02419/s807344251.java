import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine().toLowerCase();
		int count = 0;
		
		end:
		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			String[] strs = str.split(" ");
			for (int i = 0; i < strs.length; i++) {
				if(strs[i].equals("END_OF_TEXT")){
					break end;
				}
				if (strs[i].toLowerCase().equals(ans)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}