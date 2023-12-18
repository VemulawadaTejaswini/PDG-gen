import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int n = sc.nextInt();
		boolean flag = false;
		for(int i = 0; i < n; i++) {
			int s = sc.nextInt();
			int f = sc.nextInt();
			
			if(s <a && a < f || a <= s && s < b) {
				flag = true;
			}
		}
		
		int ans = flag? 1 : 0;
		System.out.println(ans);
	}
}
