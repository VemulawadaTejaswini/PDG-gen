import java.util.Scanner;
import static java.lang.Math.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			int[] s = new int[n];
			for(int i = 0; i < n; i++){
				s[i] = sc.nextInt();
			}
			int sum = 0;
			for(int i = 0;i < n; i++){
				sum += s[i];
			}
			double ave = (double)sum / n;
			double ans = 0;
			for(int i = 0; i < n; i++){
				ans += pow(s[i] - ave, 2);
			}
			ans = sqrt(ans/n);
			System.out.println(ans);
		}
	}
}

