import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int ok = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.substring(i, i+1).contentEquals("o")) {
				ok++;
			}
		}

		if((15-s.length() + ok) >= 8) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}



	}
}