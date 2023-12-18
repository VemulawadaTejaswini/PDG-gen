import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str[] = new String[100];
		for(int i = 0; i < n; i++) {
			str[i] = scan.next();
		}
		int ans = 0;
		String str1 = "Y";
		for(int i = 0; i < n; i++) {
			if(str[i].equals(str1)) {
				ans = 1;
			}
		}
		
		if(ans == 1) {
			System.out.println("Four");
		} else {
			System.out.println("Three");
		}
	}
}