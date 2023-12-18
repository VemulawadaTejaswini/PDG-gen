import java.util.*;
import java.io.*;
 
public class Main{
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
		long[] A = new long[N];
		for(int i = 0; i < N; i++){
			A[i] = s.nextLong();
		}

		long sum = 1;
		boolean r = false;
		for(int i = 0; i < N; i++){
			sum = sum*A[i];
			if(A[i] == 0L){
				sum = 0;
				r = false;
				break;
			}
			if(sum > (long)(Math.pow(10, 18)) || sum <= 0L){
				r = true;
			}
		}

		if(r){
			System.out.println(-1);
		}else{
			System.out.println(sum);
		}
        
	}
} 