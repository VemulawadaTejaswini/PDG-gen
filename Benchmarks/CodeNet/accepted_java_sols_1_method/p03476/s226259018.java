import java.io.*;
import java.util.*;

public class Main {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  static final int N = 100001;
  static int[] prefix;
  
	public static void main (String[] args) throws IOException {    
    boolean[] isPrime = new boolean[N]; // or use bitset for space
    isPrime[2] = true;
    for (int i = 3; i < N; i += 2) isPrime[i] = true;
    for (int i = 3; i < N; i += 2) {
      if (isPrime[i]) {
        if ((long) (i) * i >= N) continue;
        for (int j=i*i; j<N; j+=i) isPrime[j] = false;
      }
    }
    
    prefix = new int[N];
    int count = 0;
    
    for(int i = 1; i < N; i++) {
      int M = (i+1)/2;
      if(isPrime[i] && isPrime[M]) {
        count++;
      }
      prefix[i] = count;
    }
    
    int Q = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < Q; i++) {
      String[] line = br.readLine().split(" ");
      int L = Integer.parseInt(line[0]);
      int R = Integer.parseInt(line[1]);
      
      int ans = prefix[R] - prefix[L-1];
      bw.write(ans + "\n");
    }
    
    bw.close();
	}
}
