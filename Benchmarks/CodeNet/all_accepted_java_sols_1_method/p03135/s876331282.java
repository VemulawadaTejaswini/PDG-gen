import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = sc.nextInt();
        double ans = (double)t/x;
        System.out.println(ans);
	}
}