import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int ans = -1;
		int num = 7;
 
		for (int i = 1; i <= k; i++) {
			if (num % k == 0) {
				ans = i;
				break;
			}
 
			num = (((10 % k) * (num % k)) % k + 7 % k) % k;
		}
 
		System.out.println(ans);
 
		sc.close();
	