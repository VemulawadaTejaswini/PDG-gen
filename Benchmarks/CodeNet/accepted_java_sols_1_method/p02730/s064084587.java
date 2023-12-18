import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		String str = sca.next();
		int length = str.length();
		boolean flag = true;

		for(int i = 0; i < (length-1)/2; i++) {
			if(str.charAt(i) != str.charAt(length-i-1)) {
				flag = false;
			}
		}

		for(int i = 0; i < (length-1)/2; i++) {
			if(str.charAt(i) != str.charAt((length-1)/2 - 1 - i)) {
				flag = false;
			}
		}

		for(int i = 0; i < (length-1)/2; i++) {
			if(str.charAt((length+3)/2-1 + i) != str.charAt(length - 1 - i)) {
				flag = false;
			}
		}

		if(flag == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

		// 後始末
		sca.close();
	}
}