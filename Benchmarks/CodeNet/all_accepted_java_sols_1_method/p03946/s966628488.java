import java.util.Arrays;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] a = new int[n];

		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
		}
		int[] big = new int[n];				//i番目以降で一番大きい数を収納
		int bigmin = 0;
		for(int i = n-1;i>=0;i--){
			bigmin = Math.max(bigmin, a[i]);
			big[i] = bigmin; 
		}
		int data[] = new int[n];
		for(int i = 0;i < n;i++){
			data[i] = big[i] -a[i];
		}
		Arrays.sort(data);
		int maxnum = data[n-1];
		int ans = 0;
		for(int i = 0;i < n;i++){
			if(data[i] == maxnum){
				ans++;
			}
				
		}
		System.out.println(ans);
	}
}