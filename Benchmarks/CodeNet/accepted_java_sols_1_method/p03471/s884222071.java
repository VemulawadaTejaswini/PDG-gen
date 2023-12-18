import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int money = sc.nextInt();
		int x = -1;
		int y = -1;
		int z = -1;
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= n - i; j++) {
					if(i * 10000 + j * 5000 + (n - i - j) * 1000 == money) {
						x = i;
						y = j;
						z = n - i - j;
						break;
				}
			}
		}
		
		System.out.println(x + " " + y + " " + z);
	}
}
