import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x <= 3) {
			System.out.println(1);
			return;
		}
		outside: for(int i = x; ; i--) {
			for(int j = 2; j * j <= i; j++) {
				for(int k = 2; Math.pow(j, k) <= i; k++) {
					if(Math.pow(j, k) == i) {
						System.out.println(i);
						break outside;
					}
				}
			}
		}
	}
}