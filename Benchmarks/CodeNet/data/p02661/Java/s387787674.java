import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long median(long array[]){
		int N = array.length;
		if(N % 2 == 0){
			return (array[N / 2] + array[N / 2 - 1]) ;			
		}else{
			return array[N / 2];
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		long B[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		if(N % 2 == 1){
			long ret = median(B) - median(A) + 1;
			System.out.println(ret);			
		}else{
			long ret = median(B) - median(A) + 1;
			System.out.println(ret);			
		}
	}
}
