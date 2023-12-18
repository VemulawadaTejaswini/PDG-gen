import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] H = new int[N];
        for(int i = 0; i < N; i++) {
          H[i] = sc.nextInt();
          //System.out.println(H[i]);
        }
        Arrays.sort(H);
      	
        for(int i = 1; i <= K; i++) {
          if(N <= K) {
          	for(int j = 0; j < N; j++) {
          		H[j] = 0;  
        	}
            break;
          }
          H[N-i] = 0;
        }
    	
        long count = 0;
        for(int j = 0; j < N; j++) {
          count += H[j];  
        }
        System.out.println(count);
    }
}