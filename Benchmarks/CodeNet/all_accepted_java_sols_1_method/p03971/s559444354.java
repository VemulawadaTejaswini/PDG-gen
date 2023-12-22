import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		int in = 0;
		int ou = 0;
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == 'a' && (a+b) > (in+ou)) {
				System.out.println("Yes");
				in++;
			}
			else if(s.charAt(i) == 'b' && (a+b) > (in+ou) && b-1 >= ou) {
				System.out.println("Yes");
				ou++;
			}
			else {
				System.out.println("No");
			}
		}
	}
}