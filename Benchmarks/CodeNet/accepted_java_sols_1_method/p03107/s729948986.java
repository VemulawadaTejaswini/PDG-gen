import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] a = s.split("");
		int zero = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i].equals("0")) {
				zero ++;
			}
		}
		int one = a.length - zero;
		int ans = Math.min(zero, one) * 2;
		System.out.println(ans);
	}
}
