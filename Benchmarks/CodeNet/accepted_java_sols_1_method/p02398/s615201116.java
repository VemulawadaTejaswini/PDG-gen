
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b, c, cnt = 0, x;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		for(x = a; x <= b; x++){
			if(c % x == 0)
				cnt++;
			else if(c / x >= 0)
				a = b;
		}
		System.out.println(cnt);
	}
}