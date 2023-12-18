import java.util.*;
import java.io.*;
 
public class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int[] div = new int[N+1];
	for(int i = 1; i <= N; i++){
		for(int j = i; j <= N; j=j+i){
			div[j]++;
		}
	}

	long sum = 0;
	for(int i = 1; i <= N; i++){
		sum += (long)i*(long)div[i];
	}

	System.out.println(sum);
    
  }
}