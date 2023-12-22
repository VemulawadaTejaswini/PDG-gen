import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int[] A = new int[N];
	
	for(int i = 0; i < N; i++){
		A[i] = s.nextInt();
	}

	int max = A[0];
	long count = 0;
	for(int i = 1; i < N; i++){
		if(max<A[i]){
			max = A[i];
		}else{
			count = count + (max - A[i]);
		}
	}
	
	
	System.out.println(count);
	

    
  }
}