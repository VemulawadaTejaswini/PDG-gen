import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int ans = -1;
		if(k % 7 == 0) {
			k /= 7;
		}
		int l = 9 * k;
		int ama = 10 % l;
		for(int i = 1; i < 10000000; i++) {
			if(ama == 1) {
				ans = i;
				break;
			}
			ama = (ama*10) % l;
			
		}
		System.out.println(ans);
	}
}

