import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			if (c>='D') {
				c-=3;
			}else{
				c+=23;
			}
			System.out.print(c);
		}
		System.out.println();
	}
}