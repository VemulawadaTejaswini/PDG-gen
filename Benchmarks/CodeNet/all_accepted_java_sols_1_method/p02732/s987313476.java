import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		int arr[] = new int[(int)N];
		long count[] = new long[(int)N+1];
		long sum = 0;

		for (int i = 0; i < N ; i ++){
			arr[i] = scan.nextInt();
			count[arr[i]] += 1;
		}

		for(int i = 0; i <= N; i++){
			if(count[i] != 0 ){
				sum += count[i] * (count[i] -1) / 2;
			}
		}

		for(int k =0; k < N; k++){
			long ans = sum;
			if(count[arr[k]] > 1){
				ans -= count[arr[k]] * (count[arr[k]] - 1) / 2;
				ans += (count[arr[k]] - 1) * (count[arr[k]] - 2) / 2;
			}
			System.out.println(ans);
		}

	}
}