import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		partA101();
	}


	public static void partA101() {
		Scanner scA = new Scanner(System.in);
		String S = scA.next();
		int count = 0;

		for(int i = 0 ; i < 4 ; i++) {
			if(S.charAt(i) == '+') {
				count++;
			}else if(S.charAt(i) == '-') {
				count--;
			}
		}

		System.out.println(count);

	}
}