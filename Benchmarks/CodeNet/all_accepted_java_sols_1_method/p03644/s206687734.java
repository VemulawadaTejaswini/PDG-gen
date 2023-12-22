import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int ans = 1;
		
		for(int i = 1; i <= n; i++) {
			int count = 0;
			int temp = i;
			
			while(true) {
				if(temp%2 == 0) {
					temp = temp/2;
					count++;
				}
				else {
					break;
				}
			}
			if(count > max) {
				max = count;
				ans = i;
			}
		}
		System.out.println(ans);
	}
}
