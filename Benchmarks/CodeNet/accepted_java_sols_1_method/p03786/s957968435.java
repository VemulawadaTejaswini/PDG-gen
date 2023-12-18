import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int i, ans = 1;
		for(i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		long sum = a[0];
		for(i = 1; i < n; i++){
			if((2 * sum) >= a[i]){
				ans++;
			}else{
				ans = 1;
			}
			sum += a[i];
		}
		System.out.println(ans);
	}
}
