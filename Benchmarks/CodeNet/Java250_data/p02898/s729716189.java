import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int i,h;
		int ans = 0;

		for(i = 0; i < n; i++) {
			h = scan.nextInt();
			if(h >= k)
				ans++;
		}
		System.out.println(ans);
	}
}
