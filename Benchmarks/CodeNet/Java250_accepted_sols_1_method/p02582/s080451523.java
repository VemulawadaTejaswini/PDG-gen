import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count= 0;

		String s = scan.nextLine();

		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == 'R') {
				count++;
			}
			if(s.charAt(1) == 'S' && s.charAt(0)=='R') {
				count = 1;
			}
		}

		System.out.println(count);

		scan.close();


	}

}
