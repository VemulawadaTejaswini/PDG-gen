import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int ans = 0;
		
		for(int i = 1; i < num; i++) {
			for(int j = 0; j < num; j++) {
				int temp = (i+1) + 2*j;
				if(temp <= num) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
