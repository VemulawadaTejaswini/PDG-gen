import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] a = new int[3][105];
		int []presum = new int[105];
		int []sufsum = new int[105];
		for(int i = 1; i <= n; i++) a[1][i] = sc.nextInt();
		for(int i = 1; i <= n; i++) a[2][i] = sc.nextInt();
		for(int i = 1; i <= n; i++) presum[i] = presum[i-1] + a[1][i];
		for(int i = n; i >= 1; i--) sufsum[i] = sufsum[i+1] + a[2][i];
		int ans = 0;
		for(int i = 1; i <= n; i++)
			ans = Math.max(ans, presum[i]+sufsum[i]);
		System.out.println(ans);
	}
}
