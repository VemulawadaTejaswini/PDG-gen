import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] weights = new int[n];
		int[] sum = new int[n];
		for(int i = 0; i < n; i++){
			weights[i] = sc.nextInt();
			if(i == 0){
				sum[i] = weights[i];
			}else{
				sum[i] = weights[i] + sum[i - 1];
			}
		}
		int ans = 0;
		for(int i = 0; i < n; i++){
			if(sum[i] * 2 >= sum[n - 1]){
				ans = Math.min(Math.abs(sum[n - 1] - 2 * sum[i]),
						Math.abs(sum[n - 1] - 2 * sum[i - 1]));
				break;
			}
		}
		System.out.println(ans);
	}
}
