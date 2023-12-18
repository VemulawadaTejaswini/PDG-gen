import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		StringBuilder ans = new StringBuilder();
		if(a >= b) {
			while(a != 0) {
				ans.append(b);
				a--;
			}
			System.out.println(Integer.parseInt(ans.toString()));
		} else {
			while(b != 0) {
				ans.append(a);
				b--;
			}
			System.out.println(Integer.parseInt(ans.toString()));
		}
	}
	
	
	
}
