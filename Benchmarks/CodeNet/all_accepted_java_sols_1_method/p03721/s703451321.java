import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		
		long arr[] = new long[100001];
		Arrays.fill(arr,0);
		
		for(long i=1; i<N+1; i++){
			int a = sc.nextInt();
			long b = sc.nextLong();
			arr[a]= arr[a]+b;
		}
		
		for(int i=1; i<100001; i++){
			if(K<=arr[i]){
				System.out.println(i);
				break;
			}
			else K=K-arr[i];
		}

	}
}