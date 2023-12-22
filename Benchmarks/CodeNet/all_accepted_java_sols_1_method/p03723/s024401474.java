import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ct = 0;
		while(a % 2 == 0 && b % 2 == 0 && c % 2 == 0){
			int tmpa = a;
			int tmpb = b;
			int tmpc = c;
			a = tmpb / 2 + tmpc / 2;
			b = tmpa / 2 + tmpc / 2;
			c = tmpa / 2 + tmpb / 2;
			ct++;
			if( a == b && b == c && a == c){
				ct = -1;
				break;
			}
		}
		System.out.println(ct);
	}
}