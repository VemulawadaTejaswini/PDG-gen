import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();
		Main main = new Main();

		if (main.chkPalindrome(string) && main.chkPalindrome(string.substring(0, (string.length() - 1)/2)) && main.chkPalindrome(string.substring((string.length() + 2)/2,string.length()))) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	public boolean chkPalindrome(String string) {
		int len = string.length();
		int right = len - 1;
		int left = 0;
		while (true) {
			if (len % 2 == 0 && right < left) {
				break;
			}else if(len % 2 == 1 && right == left){
				break;
			}
			if (string.charAt(left) != string.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}