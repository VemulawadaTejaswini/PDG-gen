import java.util.Scanner;

/**
 * https://abc056.contest.atcoder.jp/tasks/abc056_b
 */
public class Main {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int ans = 0;
		if(a+w<b){
			ans = b-(a+w);
		}else if(b+w<a){
			ans = a-(b+w);
		}
	
		System.out.println(ans);
 
	}
 
}