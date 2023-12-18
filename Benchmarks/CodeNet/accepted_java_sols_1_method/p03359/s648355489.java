import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		int ans = 12;
		if(b >= a) {
			ans = a;
		}else {
			ans = a - 1;
		}
		System.out.println(ans);
	}
}
