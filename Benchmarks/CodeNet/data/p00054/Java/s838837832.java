import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int sum = 0;
			int cnt = 0;
			if(a % b == 0) {
				System.out.println(0);
				continue;
			}
			if(a > b) {
				a -= (a / b) * b;
			}
			while(cnt < n) {
				if(a % b == 0) {
					break;
				}else {
					cnt++;
					if(10 * a < b) {
						a *= 10;
					}else {
						sum += (10 * a) / b;
						a = (10 * a) % b;
					}
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
