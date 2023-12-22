import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double ans=0;
		double rev_sum=0;
		double a =0;
		
		for(int i=0;i<n;i++) {
			a = sc.nextInt();
			rev_sum += 1/a;
		}
		ans = 1/rev_sum;
		
		System.out.println(ans);
		
		
		
		
		
	}
}
