import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int t[] = {0, 1,3,1,2,1,2,1,1,2,1,2,1};
		System.out.println(t[x] == t[y] ? "Yes" : "No");
	}
}
