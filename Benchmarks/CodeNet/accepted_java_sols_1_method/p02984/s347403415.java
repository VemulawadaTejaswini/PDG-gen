import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[100000];
		for(int i = 0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		
		int ans = 0;
		for(int i = 0 ; i < n ; i++){
			ans += a[i]*(1-2*(i%2));
		}
		System.out.printf(Integer.toString(ans));
		for(int i = 1 ; i < n ; i++){
			ans = ans*(-1)+2*a[i-1];
			System.out.printf(" "+Integer.toString(ans));
		}
	}
}