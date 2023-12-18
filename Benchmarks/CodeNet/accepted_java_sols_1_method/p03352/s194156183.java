import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int ans = 0;
		for(int i = 1; i <= x; i++) {
			int temp = 0;
			for(int j = 2; j <= 10; j++) {
				int judge = (int) Math.pow(i, j);
				if(judge > x) {
					break;
				}
				temp = judge;
			
			}
			ans = Math.max(temp, ans);
		}
		System.out.println(ans);
	}
}