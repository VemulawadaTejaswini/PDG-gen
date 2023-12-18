import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String symbols = scanner.nextLine();
		String[] arr_split = symbols.split("",0);
		scanner.close();
		int ans = 0;
		for (String string : arr_split) {
			if (string.equals("+")) {
				ans++;
			} else {
				ans--;
			}
		}
		System.out.println(ans);
	}

}
