import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();// 几个500
		int B = sc.nextInt();// 几个100
		int C = sc.nextInt();// 几个50
		int X = sc.nextInt();
		int ans = 0;
		int i,j,k;
		for (i = 0; i <= A; i++) {
			for (j = 0; j <= B; j++) {
				for (k = 0; k <= C; k++) {
					if (500 * i + 100 * j + 50 * k == X)
						ans+=1;
				}
			}
		}
		System.out.println(ans);

		
	}
}
