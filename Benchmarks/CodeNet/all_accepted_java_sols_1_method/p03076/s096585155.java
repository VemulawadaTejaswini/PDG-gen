import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int rem = 10;
		for (int i = 0; i < 5; i++) {
			int b = sc.nextInt();
			if(b%10==0) {
				ans += b;
			}else {
				ans += (b/10+1)*10;
				rem = Math.min(rem,b-b/10*10);
			}
		}
		System.out.println((rem==10)?ans:ans-(10-rem));
		sc.close();
	}
}