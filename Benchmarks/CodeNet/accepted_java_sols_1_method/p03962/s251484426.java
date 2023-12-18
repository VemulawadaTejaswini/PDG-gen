import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int count = 3;
		if(a == b) {
			count -= 1;
		}
		if(a == c) {
			count -= 1;
		}
		if(b == c) {
			count -= 1;
		}
		if(a == b && b == c) {
			count += 1;
		}
		System.out.println(count);
	}
}