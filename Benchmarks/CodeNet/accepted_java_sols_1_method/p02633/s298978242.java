import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int res = t;
		int c = 0;
		while(res % 360 != 0) {
			res += t;
			c++;
		}
		System.out.println(c+1);
	}
}