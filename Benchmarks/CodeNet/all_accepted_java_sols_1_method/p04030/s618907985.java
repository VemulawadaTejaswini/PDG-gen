import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		char[] arr = in.nextLine().toCharArray();
		
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0') {
				str += "0";
			}
			else if (arr[i] == '1') {
				str += "1";
			}
			else {
				if (str.equals(""))
					continue;
				str = str.substring(0, str.length() - 1); 
			}
		}
		
		System.out.println(str);
	}
}
