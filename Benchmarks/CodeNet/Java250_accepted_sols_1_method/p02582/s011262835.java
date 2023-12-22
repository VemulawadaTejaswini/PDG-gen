import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count =0;

		if((s.charAt(0)=='R' && s.charAt(1)=='R'&& s.charAt(2)=='R')){
			System.out.println(3);
		}
		else if((s.charAt(0)=='R' && s.charAt(1)=='R') || (s.charAt(1)=='R' && s.charAt(2)=='R')) {
			System.out.println(2);
		}

		else if((s.charAt(0)=='R') || (s.charAt(1)=='R') || (s.charAt(2)=='R')){
			System.out.println(1);
		}
		else{
			System.out.println(0);
		}

	}

}