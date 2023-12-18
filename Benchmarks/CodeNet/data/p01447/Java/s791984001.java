import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ans = 1;
		while(n>3) {
			n = (n+2)/3;
			ans++;
		}
		System.out.println(ans);
	}
}