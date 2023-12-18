import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		boolean p = false;
		if (!(a==b & b==c)) {
			if (a==b || b==c || a==c) {
				p = true;
			}
		}
		if (p) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}