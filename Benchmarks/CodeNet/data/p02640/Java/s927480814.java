import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		String result = "";
		if (1<=2*x&&2*x<=y&&y<=4*x&&4*x<=100) {
			result = "Yes";
		} else {
			result = "No";
		}
		System.out.print(result);
		sc.close();
	}
}