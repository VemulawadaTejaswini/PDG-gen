import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] num = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			num[a[i]-1]++;
		}
		Arrays.sort(num);
		int sum = 0;
		for(int i=n-1; i>=n-k; i--){
			sum += num[i];
		}
		System.out.println(n-sum);
	}
}