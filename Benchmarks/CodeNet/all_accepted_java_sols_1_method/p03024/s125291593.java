import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int left = 15- str.length();
		int win = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'o') {
				win ++;
			}
		}
		if((win + left) <8) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}
}