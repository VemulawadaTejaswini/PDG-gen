import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int mod = 1000000007;
		int[] a = new int[number+1];
		long ans = 1;
		for(int i = 2; i <= number; i++){
			int k = i;
			for(int j = 2; j <= k; j++){
				while(k%j==0){
					a[j]++;
					k/=j;
				}
			}
		}
		for(int i = 0; i <= number; i++){
			if(a[i]>0){
				ans = ans*(a[i]+1)%mod;
			}
		}
		System.out.println(ans);
	}
}