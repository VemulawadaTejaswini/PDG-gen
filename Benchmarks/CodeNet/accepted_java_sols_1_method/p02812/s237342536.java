import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String t= sc.next();
		char []s =t.toCharArray(); 
		int ans =0;
	
		for(int i = 0; i <= n - 3; i++) {
			
			if(s[i] == 'A' && s[i + 1] == 'B' && s[i + 2] == 'C') {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
