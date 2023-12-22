import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int max = Integer.MIN_VALUE;
		int i,h;
		int ans = 0;
		for(i = 0; i < n; i++) {
			h = scan.nextInt();
			if(h >= max)
				ans++;
			max = Math.max(max, h);
		}

		System.out.println(ans);
	}
}
