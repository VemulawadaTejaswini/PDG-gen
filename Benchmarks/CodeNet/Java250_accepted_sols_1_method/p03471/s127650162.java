import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		int[] count = {-1, -1, -1};
		int[] amount = {10000, 5000, 1000};
		boolean isExist = false;
		
		for(int i = 0;(i <= n) && (amount[0] * i <= y);i++) {
			for(int j = 0;(amount[1] * j <= y) && (j <= n - i);j++) {
				int k = n - j - i;
				if(amount[0] * i + amount[1] * j + amount[2] * k == y) {
					count[0] = i;
					count[1] = j;
					count[2] = k;
					isExist = true;
					break;
				}
			}
			
			if(isExist) {
				break;
			}
		}
		
		System.out.println(count[0] + " " + count[1] + " " + count[2]);
    }
}