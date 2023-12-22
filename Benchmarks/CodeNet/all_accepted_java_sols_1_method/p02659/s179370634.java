import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		String b = sc.next();
		
		long ans = 0;
		ans += a * Long.valueOf(b.substring(0, 1)) * 100;
		ans += a * Long.valueOf(b.substring(2, 3)) * 10;
		ans += a * Long.valueOf(b.substring(3, 4));
		ans /= 100;
		
		System.out.println(ans);
		
		sc.close();
	}
}

