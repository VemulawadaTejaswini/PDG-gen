import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.next();
		int b = Integer.parseInt(n);
		int c = 0;
		for (Integer i = 1; i <= b; i++) {
			if(i.toString().length() % 2 == 1) {
				c++;
			}
		}
		System.out.println(c);
	}

}
