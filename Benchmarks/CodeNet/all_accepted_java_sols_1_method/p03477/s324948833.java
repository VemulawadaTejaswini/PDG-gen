
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt(), b= scanner.nextInt(), c= scanner.nextInt(), d= scanner.nextInt();
		
		int left = a+b;
		int right = c+d;
		
		String ans = "default";
		if (left<right) {
			ans = "Right";
		}else if (left==right) {
			ans = "Balanced";
		}else {
			ans = "Left";
		}
		
		System.out.println(ans);
		scanner.close();
	}
}