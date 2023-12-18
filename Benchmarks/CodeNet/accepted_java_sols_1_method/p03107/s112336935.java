import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int c0 = 0;
		int c1 = 0;

		for(char x: S.toCharArray()){
			if(x == '0'){
				c0++;
			} else {
				c1++;
			}
		}

		System.out.println(2 * Math.min(c0, c1));
	}
}