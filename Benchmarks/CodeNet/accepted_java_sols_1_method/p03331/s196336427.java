import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int b, a;
		int ans = Integer.MAX_VALUE;
		int sum;
		for(int i = 1;i <= n/2; ++i){
			a = i;
			b = n-a;
			sum = 0;
			while(a > 0 || b > 0){
				sum += a%10 + b%10;
				a/=10; b/=10;
			}

			ans = Math.min(ans, sum);
		}

		System.out.print(ans);

	}

}


//end
