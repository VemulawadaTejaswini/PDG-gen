import java.util.*;

public class Main {
	static int a, b, t, count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		t = sc.nextInt();
		count = 0;
		for(int i = a; i <= t+0.5; i+=a) {
			count+=b;
		}
		System.out.println(count);
	}
}
