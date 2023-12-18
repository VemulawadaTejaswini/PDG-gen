import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long n = Long.parseLong(sc.next());
		Long a = Long.parseLong(sc.next());
		Long b = Long.parseLong(sc.next());
		Long c = a + b;

		Long ans = 0l;

		ans = (n/c)*a;
		
		long cnt = n%c;
		
		if(cnt > a) {
			cnt = a;
		}
		ans += cnt;

		
		System.out.println(ans);
		
	}
}