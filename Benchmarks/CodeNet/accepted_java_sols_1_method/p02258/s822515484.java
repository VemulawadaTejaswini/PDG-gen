import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static final int BIG_NUM = 2000000000;

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x, ans=-BIG_NUM, min=BIG_NUM;
		
		for(int i=0; i<n; i++){
			x = scan.nextInt();
			ans = Math.max(ans, x-min);
			min = Math.min(x, min);
		}
		
        System.out.println(ans);
        
		scan.close();
	}
}
