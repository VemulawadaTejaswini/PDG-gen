import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] g = new int[101];
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) {
				boolean flag = true;
				for(int i = 3; i < 101; i++) {
					if(g[i] % 2 == 1) {
						flag = false;
						break;
					}
				}
				if(g[1] % 2 == 0 || g[2] % 2 == 0) {
					flag = false;
				}
				Arrays.fill(g, 0);
				if(flag) {
					System.out.println("OK");
				}else {
					System.out.println("NG");
				}
			}else {
				g[a]++;
				g[b]++;
			}
		}
		sc.close();
	}
}
