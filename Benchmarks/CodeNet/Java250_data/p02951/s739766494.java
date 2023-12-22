import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt() - sc.nextInt();
		int ans = sc.nextInt() - in;
		if(ans > 0)System.out.println(ans);
		else System.out.println(0);
	}
}