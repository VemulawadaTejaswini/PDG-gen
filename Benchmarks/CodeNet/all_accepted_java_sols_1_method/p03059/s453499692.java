import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();
		
		int times = T/A;
		int ans = 0;
		for(int i = 1; i <= times; i++){
			ans += B;
		}
		
		System.out.println(ans);
	}
}