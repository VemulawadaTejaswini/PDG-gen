
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		char[] chars = sc.next().toCharArray();
		int borderNum = 0;
		for(int i = 0; i < n - 1; i++){
			if(chars[i] != chars[i + 1]){
				borderNum += 1;
			}
		}
		int ans = Math.min(n - 1, n - 1 - borderNum + k * 2);
		System.out.println(ans);
	}
}
