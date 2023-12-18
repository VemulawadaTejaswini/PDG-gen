import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int width = z;
		int cnt = 0;
		while (width <= x) {
			width += y + z;
			if (width <= x) cnt++;
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}


