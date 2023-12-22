import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int d[] = new int[100000];
		int change = 0;
		String input = sc.next();

		char tmp = input.charAt(0);
		int c = 0;
		for(int i = 1 ; i < n ; i++){
			if(tmp == input.charAt(i)){
				c++;
			}else{
				tmp = input.charAt(i);
				d[change] = c+1;
				c = 0;
				change++;
			}
		}
		d[change] = c+1;
		change++;

		int m = 0;
		int mPos = 0;
		int sum = 0;
		for(int i = 0 ; i < 2*k+1 && i < change ; i++){
			sum += d[i];
		}
		m = sum;
		for(int i = 1 ; i+2*k < change ; i++){
			sum -= d[i-1];
			sum += d[i+2*k];
			if(sum > m){
				m = sum;
				mPos = i;
			}
		}

		int ans = m-1;
		for(int i = 0 ; i < mPos ; i++){
			ans += d[i]-1;
		}
		for(int i = mPos+2*k+1 ; i < change ; i++){
			ans += d[i]-1;
		}

		System.out.println(ans);
	}
}