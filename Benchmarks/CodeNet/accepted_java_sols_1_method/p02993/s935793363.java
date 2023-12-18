import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] li = sc.next().toCharArray();
		char ch = li[0];
		boolean check = false;
		for(int i = 1; i < 4; i++) {
			if(li[i] == ch) {
				check = true;
			}
			ch = li[i];
		}
		if(check == true) {
			System.out.println("Bad");
		}else {
			System.out.println("Good");
		}
	}
}