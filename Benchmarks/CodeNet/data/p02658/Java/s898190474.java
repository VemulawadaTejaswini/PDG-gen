//B
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long A[] = new long[(int)N];
		long x = 1000000000000000000L;
		long answer = 1L;

		for(int i=0; i<N; i++){
			A[i] = in.nextLong();
			answer *= A[i];
		}
		
		if(answer > x){
			System.out.println(-1);
		}else{
			System.out.println(answer);
		}
	}
}