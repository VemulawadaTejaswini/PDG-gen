import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
		long[] A = new long[N];
		for(int i = 0; i < N; i ++){
			A[i] = sc.nextLong();
		}
		long sum = 1L;
		long max = (long)Math.pow(10, 18);
		for(int i = 0; i < N; i ++){
			if(A[i] == 0){
				sum = 0;
				break;
			}else if(A[i] > max / sum){
				sum = -1;
			}else{
			sum *= A[i];
			}
		}
		System.out.println(sum);
    }
}
