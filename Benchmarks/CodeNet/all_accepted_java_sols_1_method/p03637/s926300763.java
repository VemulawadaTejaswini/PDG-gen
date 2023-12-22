import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		for(int i = 0 ; i < n ; i++) {
			int x = sc.nextInt();
			if(x % 2 != 0) {
				a++;
			}
			if(x % 4 == 0) {
				b++;
			}
			if(x % 2 == 0 && x % 4 != 0) {
				c++;
			}
		}
		
		if(b >= a) {
			System.out.println("Yes");
		}
		
		if(b < a) {
			if(a - b == 1 && c == 0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}

	}

}
