import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		int x = 0;
		
		for(int i = 0; i < 4; i++) {
			if(S.charAt(i) == '+') {
				x++;
			} else {
				x--;
			}
		}
		System.out.println(x);		
	}
}
