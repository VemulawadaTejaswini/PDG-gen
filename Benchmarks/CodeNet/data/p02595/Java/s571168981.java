import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int D = s.nextInt();
	int[] X = new int[N];
	int[] Y = new int[N];
	for(int i = 0; i < N; i++){
		X[i] = s.nextInt();
		Y[i] = s.nextInt();
	}

	int count = 0;
	for(int i = 0; i < N; i++){
		if(D*D >= X[i]*X[i] + Y[i]*Y[i]){
			count++;
		}
	}
	System.out.println(count);
	
    
  }
}