import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if(s.length() < 3 || s.length() > 100)
			return;
		String[] out_s = s.split("");
		System.out.print(out_s[0] + (out_s.length - 2) + out_s[out_s.length-1]);
		

		System.out.println("");

	}

}