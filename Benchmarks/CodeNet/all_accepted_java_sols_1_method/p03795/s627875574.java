import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int x = N * 800;
	int y = 200 * (x / 12000);
	int ans = x - y;
	System.out.println(ans);
}
}