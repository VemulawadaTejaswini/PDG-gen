import java.util.*;
 
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int N = sc.nextInt();
		int K = sc.nextInt();
        int[] d = new int[K];
        int[] h = new int[N];
        
        for(int i=0; i<K; i++){
          d[i] = sc.nextInt();     //i番目のお菓子を持っている人数
          int[] A = new int[d[i]];
          for(int j=0; j<d[i]; j++){
            A[j] = sc.nextInt();
            h[A[j]-1]++;
          }
        }
      
        int count = 0;
        for(int i=0; i<N; i++){
          if(h[i]==0){
            count++;
          }
        }
        System.out.println(count);
	}
}