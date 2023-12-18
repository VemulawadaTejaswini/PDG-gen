import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int ans = 0;
		for (int i = 1; i <= N; i++) {
			String str = String.valueOf(i);
			int count = 0;
			for (char c : str.toCharArray()) {
				count += (int)c - 48;
			}
			
			if (count >= A && count <= B) {
				ans += i;
			}
		}
		
		System.out.println(ans);
	}
}