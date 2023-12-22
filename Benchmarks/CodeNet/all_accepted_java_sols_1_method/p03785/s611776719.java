import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i < n; i++){
		a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int cnt = 1;
		int WaitTime = a[0];
		int ans = 1;
		for(int i = 1; i < n; i++){
			if(cnt == c||a[i] - WaitTime > k){
				ans++;
				cnt = 0;
				WaitTime = a[i];
			}
			cnt++;
		}
		System.out.println(ans);
 
	}
 
}