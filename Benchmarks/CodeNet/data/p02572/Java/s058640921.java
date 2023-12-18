import java.io.*;
import java.util.*;

class Main {
 	public static void main(String args[]) throws IOException {
     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	int N = Integer.parseInt(br.readLine());
      	StringTokenizer st = new StringTokenizer(br.readLine());
      	int[] arr = new int[N];
      	long sum = 0;
      	long ans = 0;
      	for(int i=0;i<N;i++) {
         	arr[i] = Integer.parseInt(st.nextToken()); 
          	sum += arr[i];
        }
      	for(int i=0;i<N;i++) {
         	 ans += (sum*arr[i]);
        }
      	System.out.println(ans);
    }
}