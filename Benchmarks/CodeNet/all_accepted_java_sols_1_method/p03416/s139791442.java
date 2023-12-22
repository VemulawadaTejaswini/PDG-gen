import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int cnt = 0;
		for(int i = a; i <= b; i++) {
			int n10 = i % 10;
			int n100 = i / 10 % 10;
			int n1000 = i / 1000 % 10;
			int n10000 = i / 10000 % 10;
			if(n10 == n10000 && n100 == n1000) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}