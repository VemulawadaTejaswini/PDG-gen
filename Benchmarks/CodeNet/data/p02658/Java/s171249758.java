import java.util.*;
public class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		//input integer
		int N = sc.nextInt();
		long A[] = new long[N];
		long result = 1;
		for(int i=0; i<N; i++) {
			A[i] = sc.nextLong();
			//System.out.println("A[i] "+A[i]);
			//System.out.println(Math.round(result)+"result1 "+result);
			result = result*A[i];
			//System.out.println(Math.round(result)+"result2 "+result);
			if(result>(long)Math.pow(10, 18)) {
				result = -1;
				//System.out.println(Math.round(result)+"result3 "+result);
				//break;shinai
			}
		}
		//System.out.println((long)Math.pow(10, 18));
		if(result>(long)Math.pow(10, 18)||result<0) {
			result = -1;
			//System.out.println((long)Math.pow(10, 18));
		}
		System.out.println(result);
		sc.close();
	}
}