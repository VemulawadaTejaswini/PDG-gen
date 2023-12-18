import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	long[] L = new long[N];
	for(int i = 0; i < N; i++){
		L[i] = s.nextLong();
	}

	int count = 0;
	for(int i = 0; i < N; i++){
		for(int j = i+1; j < N; j++){
			for(int k = j+1; k < N; k++){
				if((L[i]+L[j]>L[k] && L[i]+L[k]>L[j] && L[k]+L[j]>L[i]) 
				&& L[i] != L[j] && L[i] != L[k] && L[k] != L[j]){
					count++;
				}
			}
		}
	}

	

	System.out.println(count);

    
  }
}